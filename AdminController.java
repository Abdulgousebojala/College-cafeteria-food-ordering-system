package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MenuItem;
import com.example.demo.Service.MenuItemService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private MenuItemService menuItemService;

    // Add new menu item
    @PostMapping("/menu")
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        return menuItemService.addItem(item);
    }

    // Delete menu item
    @DeleteMapping("/menu/{id}")
    public String deleteMenuItem(@PathVariable Long id) {
        menuItemService.deleteItem(id);
        return "Menu item deleted";
    }
    
}