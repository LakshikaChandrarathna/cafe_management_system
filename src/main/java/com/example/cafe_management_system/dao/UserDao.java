package com.example.cafe_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cafe_management_system.POJO.User;
public interface UserDao extends JpaRepository<User, Integer> {
}
