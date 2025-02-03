package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.shop;
import com.example.demo.service.shopservice;


@Controller

public class shopcontroller {
	@Autowired
	
	private shopservice ser; 
	
	
	@GetMapping("/")
	public String index() {
		return "index";
		
	}
	
	@GetMapping("/addproducts")
	public String addbook() {
		return "/addproducts";
		
	}
	
	@PostMapping("/save")
	public String saveshop(@ModelAttribute shop b) { 
		ser.add(b);
		return "redirect:/viewproducts";
		 
	}
	

	@GetMapping("/viewproducts")
		public ModelAndView viewproducts() { 
			List<shop> obj=ser.getallshops();
			return new ModelAndView("viewproducts","bks",obj);
		}
	@GetMapping("/editproducts/{id}")
	public String editpdt(@PathVariable("id") int id,Model model) {
		shop p=ser.getshopbyid(id);
		model.addAttribute("bk",p);
		return "editproducts";
	}
	
	@GetMapping("/deleteproducts/{id}")
	public String deleteproducts(@PathVariable("id")int id) {
		ser.deletebyid(id);
		return "redirect:/viewproducts";
	}

}