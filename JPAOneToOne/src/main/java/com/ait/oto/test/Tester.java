package com.ait.oto.test;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.dao.impl.PersonDAOImpl;
import com.ait.oto.entities.Passport;
import com.ait.oto.entities.Person;

public class Tester {

	public static void main(String[] args) 
	{
		PersonDAO dao = new PersonDAOImpl();
	
		//savePerson() em.merge(loan) method require if used persist then exception
				Person p1 = new Person();
				p1.setPersonId(101);
				p1.setPersonName("Akash");
				
				Person p2 = new Person();
				p2.setPersonId(102);
				p2.setPersonName("Rahul");
				
				Person p3 = new Person();
				p3.setPersonId(103);
				p3.setPersonName("Akash");
				
				
				Passport passport1 = new Passport();
				passport1.setPassportId(11201);
//				passport1.setExpDate("2006-10-20");
				
				Passport passport2 = new Passport();
				passport2.setPassportId(11202);
//				passport2.setExpDate("2018-10-22");
				
				
				//one passport object to One Person object
				
//				
//				pLoan.setCustomer(customer);
//				vloan.setCustomer(customer);
//				hloan.setCustomer(customer);
//				
//				dao.saveLoan(pLoan);
//				dao.saveLoan(vloan);
//				dao.saveLoan(hloan);
				
				
				/*
				//call fetchLoanDetailsById()
				Loan loan = dao.fetchLoanDetailsById(233451);
				System.out.println(loan);
				
				Customer c = loan.getCustomer();
				System.out.println(c);
				*/
				
		/*		call removeLoan
				
				dao.removeLoan(459908);
				*/		
	
	
	}

}
