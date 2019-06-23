package com.personalloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalloan.Model.Customerdetails;
import com.personalloan.Service.CustomerServicee;



@RestController
@RequestMapping("/personal bank")
public class PersonalloanController {
	
	@Autowired
	CustomerServicee customerservice;

    
	@PostMapping("/customers/ add")
	public String addCustomers(@RequestBody Customerdetails customerdetails) {
		return customerservice.addCustomers(customerdetails);
	}
	@GetMapping("/customers/get")
	
	public List<Customerdetails> getAllCustomersDetails(){
		return null;
	}
}
