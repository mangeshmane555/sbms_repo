package in.mane.reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
//@Primary
public class PdfReport implements IReport 
{
	@Override
	public void generateReport() {
		System.out.println("Pdf Report is generated");		
	}
}
