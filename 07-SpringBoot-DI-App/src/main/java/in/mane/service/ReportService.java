package in.mane.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mane.dao.IReportDao;
//import in.mane.dao.ReportDaoImpl;

@Service
public class ReportService {

//	@Autowired
	private IReportDao reportDao;
	
	@Autowired
	public ReportService(IReportDao reportDao) {
	this.reportDao = reportDao;
}

	// CI
//	@Autowired
//	public ReportService(ReportDaoImpl reportDao) {
//		System.out.println("Param constructor");
//		this.reportDao = reportDao;
//	}
//	
	// Setter Injection
//	@Autowired
//	public void setReportDao(ReportDao reportDao) {
//		System.out.println("setReportDao Method called");
//		this.reportDao = reportDao;
//	}

	public void printName(Integer userId) {
		String nameById = reportDao.getNameById(userId);
		
		System.out.println("nameById--  "+nameById);
		
		
	}
	
}
