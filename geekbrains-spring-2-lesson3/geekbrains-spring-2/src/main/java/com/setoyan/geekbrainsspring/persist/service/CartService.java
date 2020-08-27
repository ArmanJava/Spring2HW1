package com.setoyan.geekbrainsspring.persist.service;

import java.util.Set;

import com.setoyan.geekbrainsspring.persist.model.Product;

/**
 * CartService
 */
public interface CartService {

    void addItem(Long id);

    void removeItem(Long id);

    Set<Product> getAllItems();

    int getItemCount();

    void clearCart();

    
}
