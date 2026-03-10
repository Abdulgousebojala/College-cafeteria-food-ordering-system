package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private Integer quantity;

    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "order_id")
    private Long orderId;

    public OrderItem() {}

    public OrderItem(Long id, Double price, Integer quantity, Long menuId, Long orderId) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.menuId = menuId;
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}