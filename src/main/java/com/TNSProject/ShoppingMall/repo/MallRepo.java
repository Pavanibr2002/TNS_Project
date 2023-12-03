package com.TNSProject.ShoppingMall.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TNSProject.ShoppingMall.entity.Mall;

public interface MallRepo extends JpaRepository<Mall, Long> {

}
