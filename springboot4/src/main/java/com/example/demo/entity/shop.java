package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //identity is meaning the first default id's
	private int id;
	private String bname;
	private String author;
	private int stock;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public shop(int id, String bname, String author, int stock, int price) {
		super();
		this.id = id;
		this.bname = bname;
		this.author = author;
		this.stock = stock;
		this.price = price;
	}
	public shop() {
		super();
		// TODO Auto-generated constructor stub
	}
}
