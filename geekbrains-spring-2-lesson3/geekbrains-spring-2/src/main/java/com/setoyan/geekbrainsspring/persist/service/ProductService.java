package com.setoyan.geekbrainsspring.persist.service;

import com.setoyan.geekbrainsspring.persist.model.Product;

/**
 * ProductService
 */
public interface ProductService extends CommonCrudInterface<Product> {

    boolean deleteProductPicture(Long id, Product product);
}
