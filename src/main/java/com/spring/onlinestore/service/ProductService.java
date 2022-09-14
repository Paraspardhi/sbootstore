package com.spring.onlinestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinestore.dao.ProductDao;
import com.spring.onlinestore.entity.Product;
@Service
public class ProductService {
	@Autowired
	private ProductDao pdao;
	public String addProduct(Product p)
	{
		pdao.save(p);
		return "Product Added";
	}
	
	public String viewProduct(int pid)
	{
		Product p = pdao.findById(pid).orElse(null);
		if(p!=null)
		{
			return p.toString();
		}
		return "Product Unavailable";
	}
	
	public String viewAllProduct()
	{
		return pdao.findAll().toString();
	}
	public String updateProduct(Product p)
	{
		for(Product p1 : pdao.findAll())
		{
			if(p1.getPid() == p.getPid())
			{
				pdao.deleteById(p.getPid());
			}
		}
		pdao.save(p);
		return "Product updated";
	}
	
	public String deleteProduct(int pid) {
		for(Product p : pdao.findAll())
		{
			if(pid == p.getPid())
			{
				pdao.deleteById(pid);
				return "Product Deleted";
			}
		}
		return "Product unavailable";
	}
}
