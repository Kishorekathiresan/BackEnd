package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.ExchangeRate;
import com.example.demo.repositories.ExchangeRateRepository;

@Controller
public class ExchangeRateController {
	@Autowired
	private ExchangeRateRepository ExchangeRateRepository;
	
	@GetMapping("/ConvertedValue")
    public String ConValue() {
    	return "ConvertedValue";
    }
	
	@PostMapping("/ConvertedValue")
    public String convertCurrency(
            @RequestParam String sourceCurrency,
            @RequestParam String targetCurrency,
            @RequestParam double amount,
   
            Model model) {
	
       
        double convertedAmount = amount;
 
        model.addAttribute("convertedAmount", convertedAmount);
 
        return "ConvertedValue";
	}
	
	@GetMapping("/addValues")
	public String addvalues() {
		return "addValues";
	}
	
	@GetMapping("/updateValues")
	public String updateValues() {
		return "updateValues";
	}
	
	@PostMapping("/addValues")
	public String getaddValues(ExchangeRate ExchangeRate) {
		ExchangeRateRepository.save(ExchangeRate);
		return "addedValues";
	}
	@PostMapping("/updateValues")
	public String getupdateValues(ExchangeRate ExchangeRate) {
		ExchangeRateRepository.save(ExchangeRate);
		return "updatedValues";
	}
	
	
	  
	 
	

}
