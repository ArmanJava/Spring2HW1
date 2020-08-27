package com.setoyan.geekbrainsspring.persist.repo;

import com.setoyan.geekbrainsspring.persist.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    
}
