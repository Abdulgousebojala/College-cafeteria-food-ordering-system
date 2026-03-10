package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Orders;
import com.example.demo.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place order
    @PostMapping
    public Orders placeOrder(@RequestBody Orders order) {
        return orderService.placeOrder(order);
    }

    // Get all orders
    @GetMapping
    public List<Orders> getOrders() {
        return orderService.getAllOrders();
    }

    // Get order by id
    @GetMapping("/{id}")
    public Orders getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}