package com.example.orderservice.service;

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.model.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(OrderRequest orderRequest);
    List<Order> getOrdersByUserId(Long userId);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order updateOrderStatus(Long id, String status);
}