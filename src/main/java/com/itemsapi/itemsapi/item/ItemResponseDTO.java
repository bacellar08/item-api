package com.itemsapi.itemsapi.item;

public record ItemResponseDTO(Long id, String productName, String description, Double price, Integer quantity, String image) {
    public ItemResponseDTO(Item item) {
        this(item.getId(), item.getProductName(), item.getDescription(), item.getPrice(), item.getQuantity(), item.getImage());
    }
}
