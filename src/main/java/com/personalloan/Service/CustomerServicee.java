package com.personalloan.Service;

import java.util.List;

import com.personalloan.Model.Customerdetails;



public interface CustomerServicee {
	
	public String addCustomers(Customerdetails customerdetails);
	
	public List<Customerdetails> getAllCustomersDetails();
	
}
