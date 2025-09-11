package in.mane.reports;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport 
{
	@Override
	public void generateReport() {
		System.out.println("Excel Report is generated");
	}
}
