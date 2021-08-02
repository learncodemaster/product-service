package com.ps.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.api.entity.Product;

public interface ProductDao extends JpaRepository<Product,Long>{

}
