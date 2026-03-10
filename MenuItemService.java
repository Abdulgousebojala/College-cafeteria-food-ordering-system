package com.example.demo.Service;

import com.example.demo.Model.MenuItem;
import com.example.demo.Repository.MenuItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    // Add new food item
    public MenuItem addItem(MenuItem item) {
        return menuItemRepository.save(item);
    }

    // Get all menu items
    public List<MenuItem> getMenu() {
        return menuItemRepository.findAll();
    }

    // Get menu item by id
    public MenuItem getItemById(Long id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    // Delete item
    public void deleteItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    // Update menu item
    public MenuItem updateItem(Long id, MenuItem item) {

        MenuItem existingItem = menuItemRepository.findById(id).orElse(null);

        if (existingItem != null) {

            existingItem.setItemName(item.getItemName());
            existingItem.setDescription(item.getDescription());
            existingItem.setPrice(item.getPrice());
            existingItem.setAvailability(item.getAvailability());

            return menuItemRepository.save(existingItem);
        }

        return null;
    }
}