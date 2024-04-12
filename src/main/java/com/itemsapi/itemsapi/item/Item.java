package com.itemsapi.itemsapi.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="items")
@Entity(name="items")
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    String description;
    Double price;
    Integer quantity;
    String image;

}
