package com.example.demo.Service;

import com.example.demo.Model.Orders;
import com.example.demo.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Place order
    public Orders placeOrder(Orders order) {

        order.setStatus("PENDING");

        return orderRepository.save(order);
    }

    // Get all orders
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by id
    public Orders getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Update order status
    public Orders updateOrderStatus(Long id, String status) {

        Orders order = orderRepository.findById(id).orElse(null);

        if (order != null) {
            order.setStatus(status);
            return orderRepository.save(order);
        }

        return null;
    }
}