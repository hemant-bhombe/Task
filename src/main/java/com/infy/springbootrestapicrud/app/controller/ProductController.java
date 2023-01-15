package com.infy.springbootrestapicrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.servicei.ProductServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api")
public class ProductController {

	@Autowired
	ProductServiceI psi;
	
	@PostMapping("/product")
	public Product registerproduct(@RequestBody Product p)
	{
		Product pro	=	psi.savedata(p);
		return pro;
	}
	
	@GetMapping("/productinfo")
	public Iterable<Product> productinfo() 
	{
		Iterable<Product> pro	=psi.getproductinfo();
		return pro;
	}
	
	@DeleteMapping("/removeproduct/{productId}")
	public String deleteproduct(Product p)
	{
		psi.deleteproduct(p);
		return "deleted";
	
	}
	@PutMapping("/updateproduct/{productId}")
	public Product updatedata(@PathVariable Integer productId, @RequestBody Product p)
	{
		Product pro	=psi.updatedata(productId, p);
		return pro;
	}
}
