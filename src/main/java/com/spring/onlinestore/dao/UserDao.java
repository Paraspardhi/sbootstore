package com.spring.onlinestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onlinestore.entity.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
