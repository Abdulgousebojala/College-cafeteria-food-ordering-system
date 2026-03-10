package com.example.demo.Service;

import com.example.demo.Model.CartItem;
import com.example.demo.Repository.CartItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    // Add item to cart
    public CartItem addToCart(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    // View cart items
    public List<CartItem> getCartItems() {
        return cartItemRepository.findAll();
    }

    // Remove item from cart
    public void removeItem(Long id) {
        cartItemRepository.deleteById(id);
    }

    // Clear cart
    public void clearCart() {
        cartItemRepository.deleteAll();
    }
}