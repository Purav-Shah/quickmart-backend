package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.InventoryResponse;
import com.example.inventoryservice.model.InventoryItem;
import java.util.List;

public interface InventoryService {
    List<InventoryResponse> isInStock(List<Long> productIds);
    InventoryItem updateInventory(Long productId, Integer quantityChange);
    InventoryItem addInventoryItem(InventoryItem inventoryItem);
    InventoryItem getInventoryByProductId(Long productId);
    List<InventoryItem> getAllInventory();
}