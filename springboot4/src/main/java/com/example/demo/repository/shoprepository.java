
package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.shop;

@Repository

public interface shoprepository extends JpaRepository<shop,Integer>{
 //id'sdatatype INTEGER
	// book-entity's class/also called table
	
	
}
