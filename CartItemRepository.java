package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}