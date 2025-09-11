package in.mane.beans;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/* =========================Programmatic Approach  =======================================================
public class Motor implements InitializingBean, DisposableBean
{
	public Motor() { 
		System.out.println("Zero param Motor : constructor");
	}
//	public void start() {
//		System.out.println("Motor Starting..");
//	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor started...");	
	}
	public void doWork() {
		System.out.println("Motor Pulling Water");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Stopped....");
		
	}
//	public void stop() {
//		System.out.println("Motor Stopped...");
//	}
}
=========================Programmatic Approach Ends ================================================== */

/* =========================Annotation Approach  =======================================================*/

public class Motor
{
	public Motor() { 
		System.out.println("Zero param Motor : constructor");
	}
	@PostConstruct
	public void m1() {
		System.out.println("Motor Starting..");
	}
	
	public void doWork() {
		System.out.println("Motor Pulling Water");
	}
	@PreDestroy
	public void m2() {
		System.out.println("Motor Stopped...");
	}
}
//=========================Annotation Approach Ends ================================================== */


