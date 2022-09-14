package com.spring.onlinestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.onlinestore.entity.Product;
import com.spring.onlinestore.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@RequestMapping("addproduct")
	@ResponseBody
	public String addProduct(Product p)
	{
	
		return ps.addProduct(p);
	}
	@RequestMapping("index")
	
	public String getBookHome(){
		return "index.jsp";
	}
	
	@RequestMapping("viewproduct")
	@ResponseBody
	public String viewProduct(int pid){
		return ps.viewProduct(pid);
	}
	
	@RequestMapping("viewalproductlbook")
	@ResponseBody
	public String viewAllProduct(){
		return ps.viewAllProduct();
	}
	
	@RequestMapping("updateproduct")
	@ResponseBody
	public String updateProduct(Product p)
	{
		return ps.updateProduct(p);
	}
	
	@RequestMapping("deleteproduct")
	@ResponseBody
	public String deleteProduct(int pid){
		return ps.deleteProduct(pid);
	}
}
