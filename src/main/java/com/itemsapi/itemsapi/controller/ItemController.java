package com.itemsapi.itemsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itemsapi.itemsapi.item.Item;
import com.itemsapi.itemsapi.item.ItemRepository;



@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAll() {

        List<Item> itemList = itemRepository.findAll();
        return itemList;
    }
}
