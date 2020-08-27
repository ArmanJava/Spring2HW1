package com.setoyan.geekbrainsspring.controller;

import com.setoyan.geekbrainsspring.persist.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CartController
 */
@Controller
@RequestMapping("cart")
public class CartController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String showCart(Model model) {
        model.addAttribute("order", orderService.composeNewOrder());
        return "cart";
    }

}
