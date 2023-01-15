package com.infy.springbootrestapicrud.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.repository.ProductRepository;
import com.infy.springbootrestapicrud.app.servicei.ProductServiceI;

@Service
public class ProductServiceimpl implements ProductServiceI{

	@Autowired
	ProductRepository hr;
	
	@Override
	public Product savedata(Product p) {
		Product pro= hr.save(p);
		return pro;
		
	}

	@Override
	public Iterable<Product> getproductinfo() {
		return hr.findAll();
	}

	@Override
	public void deleteproduct(Product p) {
		hr.delete(p);
		
	}

	@Override
	public Product updatedata(Integer productId, Product p) {
		Optional<Product> op = hr.findById(productId);
		if(op.isPresent()) {
			Product product=op.get();
			product.setProductName(p.getProductName());
			product.setProductBrand(p.getProductBrand());
			product.setProductPrice(p.getProductPrice());
			return hr.save(product);
		}
		else
		{
			return null;
		}
	}


	
	
}
