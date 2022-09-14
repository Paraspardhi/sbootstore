package com.spring.onlinestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onlinestore.entity.Product;

public interface ProductDao  extends JpaRepository<Product,Integer>{

}
