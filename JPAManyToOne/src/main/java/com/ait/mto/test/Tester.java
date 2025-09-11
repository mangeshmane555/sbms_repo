package com.ait.mto.test;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.dao.impl.LoanDAOImpl;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;

public class Tester {

	public static void main(String[] args) {
		
		//Assign implemented class object to the Interface reference var
		LoanDAO dao = new LoanDAOImpl();
		
		
		//saveLoan() em.merge(loan) method require if used persist then exception
		Loan pLoan = new Loan();
		pLoan.setLoanId(101188);
		pLoan.setLoanType("PERSONAL LOAN");
		pLoan.setAmount(500000.0);
		
		Loan vloan = new Loan();
		vloan.setLoanId(233451);
		vloan.setLoanType("VEHICLE LOAN");
		vloan.setAmount(1100000.0);
		
		Loan hloan = new Loan();
		hloan.setLoanId(459908);
		hloan.setLoanType("HOME LOAN");
		hloan.setAmount(1100000.0);
		
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("A");
		
		//Many Loans object to One Customer object
		pLoan.setCustomer(customer);
		vloan.setCustomer(customer);
		hloan.setCustomer(customer);
		
		dao.saveLoan(pLoan);
		dao.saveLoan(vloan);
		dao.saveLoan(hloan);
		
		
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
