package com.setoyan.geekbrainsspring.persist.service;

import com.setoyan.geekbrainsspring.persist.model.Order;

/**
 * OrderService
 */
public interface OrderService extends CommonCrudInterface<Order> {
        
    Order composeNewOrder();
}
