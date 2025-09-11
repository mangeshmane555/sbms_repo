package in.mane.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.mane.cfg.AppConfig;
import in.mane.service.ReportService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = context.getBean(ReportService.class);
		service.generate();
	}
}
