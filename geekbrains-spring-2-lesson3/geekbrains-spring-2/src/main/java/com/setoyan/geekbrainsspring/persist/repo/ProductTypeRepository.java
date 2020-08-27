package com.setoyan.geekbrainsspring.persist.repo;

import com.setoyan.geekbrainsspring.persist.model.ProductType;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodsTypeRepository
 */
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

    ProductType findByName(String name);
}
