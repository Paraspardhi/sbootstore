package com.spring.onlinestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinestore.dao.UserDao;
import com.spring.onlinestore.entity.Product;
import com.spring.onlinestore.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao udao;
	public String addUsert(User u)
	{
		udao.save(u);
		return "User Added";
	}
	
	public String viewUser(int UserId)
	{
		User u = udao.findById(UserId).orElse(null);
		if(u!=null)
		{
			return u.toString();
		}
		return "User Unavailable";
	}
	
	public String viewAllUser()
	{
		return udao.findAll().toString();
	}
	public String updateUser(User u)
	{
		for(User u1 : udao.findAll())
		{
			if(u1.getUserId() == u.getUserId())
			{
				udao.deleteById(u.getUserId());
			}
		}
		udao.save(u);
		return "User updated";
	}
	
	public String deleteProduct(int UserId) {
		for(User u : udao.findAll())
		{
			if(UserId == u.getUserId())
			{
				udao.deleteById(UserId);
				return "User Deleted";
			}
		}
		return "User unavailable";
	}

}
