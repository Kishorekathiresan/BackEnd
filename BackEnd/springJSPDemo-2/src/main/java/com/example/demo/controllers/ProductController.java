package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	
	@GetMapping("/display")
	public String displayProduct(Model model) {
		Product myprd=new Product(1,"Java",700);
		model.addAttribute("product", myprd);
		return "displayProduct";
	}
	@GetMapping("/displayList")
	public String displayProductList(Model model) {
		List<Product> prdList=new ArrayList<Product>();
		prdList.add(new Product(1,"Java",1200));
		prdList.add(new Product(2,"Python",1000));
 
		model.addAttribute("prdList",prdList);
		return "productList";
	}
	@GetMapping("/displayListItem")
	public String displayProductListItem(Model model) {
		List<Product> prdList=new ArrayList<Product>();
		prdList.add(new Product(1,"Java",1200));
		prdList.add(new Product(2,"Python",1000));
 
		model.addAttribute("prdList",prdList);
		return "productListItem";
	}
	@GetMapping("/user")
	public ModelAndView printUser() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("user","Admin");
		mv.setViewName("user");
		return mv;
	}
	    @Autowired
		ProductService service;
		@GetMapping("/displaytable")
		public String displayProductTable(Model model) {
			Product myprd=service.getProductById(2);
			model.addAttribute("product", myprd);
			return "displayProductTable";
		}

}
