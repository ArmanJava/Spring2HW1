package com.setoyan.geekbrainsspring.persist.repo;

import com.setoyan.geekbrainsspring.persist.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

    
}
