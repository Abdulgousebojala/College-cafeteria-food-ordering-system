package com.example.demo.Controller;

import com.example.demo.Model.CartItem;
import com.example.demo.Service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // Add item to cart
    @PostMapping("/add")
    public CartItem addToCart(@RequestBody CartItem cartItem) {
        return cartService.addToCart(cartItem);
    }

    // View cart
    @GetMapping
    public List<CartItem> getCart() {
        return cartService.getCartItems();
    }

    // Remove item
    @DeleteMapping("/{id}")
    public String removeItem(@PathVariable Long id) {
        cartService.removeItem(id);
        return "Item removed from cart";
    }
}