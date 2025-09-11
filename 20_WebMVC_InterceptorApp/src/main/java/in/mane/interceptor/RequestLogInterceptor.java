package in.mane.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String clientId = request.getParameter("clientId");
		System.out.println("CLientId = "+ clientId);	
		
		if ("mane".equals(clientId)) {
			return true;
		}
		
		response.getWriter().print("Invalid Request");
		//-------------------------
//		long startTime = System.currentTimeMillis();
//
//		System.out.println("pretHandle( ) method called");
//		request.setAttribute("startTime", startTime);

		//-----------------------
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("postHandle( ) method called");
		long endTime = System.currentTimeMillis();
		
		long startTime = (long) request.getAttribute("startTime");
		
		long time = endTime-startTime;
		System.out.println("Total time taken in (MS)"+ time);
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}
