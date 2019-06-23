package com.personalloan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalloan.Model.Customerdetails;
import com.personalloan.Repository.CustomerRepository;


@Service
public class Customerserviceimpl implements CustomerServicee{
 @Autowired
  CustomerRepository customerrepo;
	@Override
	public String addCustomers(Customerdetails customerdetails) {
		// TODO Auto-generated method stub
		customerrepo.save(customerdetails);
		return "customer added successfully";
	}
	@Override
	public List<Customerdetails> getAllCustomersDetails() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}
	
	
	
	
}
