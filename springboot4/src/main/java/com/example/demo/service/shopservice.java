package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.shop;
import com.example.demo.repository.shoprepository;

@Service
public class shopservice {
	@Autowired
	
	private shoprepository rep; 
	public void add(shop b) {
		rep.save(b);
	}
	
	public List<shop> getallshops(){
		return rep.findAll();
	}
	
	public shop getshopbyid(int id) {
		return rep.findById(id).get();
	}
	
	public void deletebyid(int id) {
		rep.deleteById(id);
	}
}
