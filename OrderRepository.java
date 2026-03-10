package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
