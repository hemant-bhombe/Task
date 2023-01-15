package com.infy.springbootrestapicrud.app.servicei;

import com.infy.springbootrestapicrud.app.model.Product;

public interface ProductServiceI {

	public Product savedata(Product p);

	public Iterable<Product> getproductinfo();

	public void deleteproduct(Product p);

	public Product updatedata(Integer productId, Product p);
	
	
}
