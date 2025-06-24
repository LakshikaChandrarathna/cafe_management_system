package com.example.cafe_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cafe_management_system.POJO.User;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);

}
