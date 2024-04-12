package com.itemsapi.itemsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itemsapi.itemsapi.item.Item;
import com.itemsapi.itemsapi.item.ItemRepository;
import com.itemsapi.itemsapi.item.ItemRequestDTO;
import com.itemsapi.itemsapi.item.ItemResponseDTO;



@RestController
@RequestMapping("item")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping
    public void saveItem(@RequestBody ItemRequestDTO data) {

        Item itemData = new Item(data);
        itemRepository.save(itemData);
        return;
    }

    @GetMapping
    public List<ItemResponseDTO> getAll() {

        List<ItemResponseDTO> itemList = itemRepository.findAll().stream().map(ItemResponseDTO::new).toList();
        return itemList;
    }
}
