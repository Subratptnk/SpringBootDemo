package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@Controller
public class FormController {
	
	@Autowired
	CustomerRepo repo;
	

	
	  @RequestMapping("/")
	  public String details()
	  {
		  return "form";
		  
	  }
	  
	  @RequestMapping("/details")
	  public String details(Customer customer) 
	  {
		  repo.save(customer); 
		  return "form"; 
		  
	  }
	  
	  @RequestMapping("/getdetails")
	  public String getDetails() 
	  {
	  
	  return "view"; 
	  
	  }
	  
	  @GetMapping("form") 
	  public String demo() 
	  { 
		  return "form"; 
	  }
	  
	  @PostMapping("/getdetails")
	  public ModelAndView viewDetails(@RequestParam int  cid) 
	  { 
		  ModelAndView mv =new ModelAndView("retrive");
		  Customer customer = repo.findById(cid).orElse(null);
		  mv.addObject(customer);
		  return mv; 
	  }
	 
	 
	  
	//********************************************************************************************************************
				
										//	REST API using JPA
	
	//********************************************************************************************************************
	  
	
	@RequestMapping("/customer")
	@ResponseBody
	public List<Customer> getCustomers()
	{
		return repo.findAll();
	}
	
	
	@RequestMapping("/customer/{cid}")
	@ResponseBody
	public Optional<Customer> getCustomersbyId(@PathVariable("cid") int cid)
	{
		return repo.findById(cid);
	}
	
	@PostMapping("/customer")
	public Customer getCustomer3(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer;
	}
	
	
	
}
