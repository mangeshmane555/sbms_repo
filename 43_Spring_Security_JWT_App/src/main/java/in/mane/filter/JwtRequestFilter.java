package in.mane.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import in.mane.security.MyUserDetailsService;
import in.mane.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	
		// Get authorization header from request first
		String authHeaderVal = request.getHeader("Authorization");
		
		// Extract Username form tokens
		String username = null;
		String jwt = null;
		
		// Authorization = Bearer <token>
		if (authHeaderVal!=null && authHeaderVal.startsWith("Bearer ")) {
			
			jwt = authHeaderVal.substring(7);
			username = jwtUtil.extractUsername(jwt);
			
		}
		
		//Load userdata based on username using userDetailsService
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			
			UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			
			// Validate token with userdetails
			if (jwtUtil.validateToken(jwt, userDetails)) {
				
				UsernamePasswordAuthenticationToken unamePwdAuthToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				unamePwdAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(unamePwdAuthToken);
					
			}
		}
		
		filterChain.doFilter(request, response);
		
		
		
	}
	
}
