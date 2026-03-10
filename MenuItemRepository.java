package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}