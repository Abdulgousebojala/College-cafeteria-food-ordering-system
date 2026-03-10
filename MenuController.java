package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MenuItem;
import com.example.demo.Service.MenuItemService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuItemService menuItemService;

    // Get all menu items
    @GetMapping
    public List<MenuItem> getMenu() {
        return menuItemService.getMenu();
    }

    // Get menu item by id
    @GetMapping("/{id}")
    public MenuItem getItem(@PathVariable Long id) {
        return menuItemService.getItemById(id);
    }
}