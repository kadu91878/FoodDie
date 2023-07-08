package com.example.fooddies.Aplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddies.Aplication.Entity.ItemEntity;
import com.example.fooddies.Aplication.Service.ItemService;

@RestController("/upload")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/upload-items")
    public String insertItem(@RequestBody ItemEntity item) {
        itemService.saveItem(item);
        return "Item inserted successfully";
    }
}
