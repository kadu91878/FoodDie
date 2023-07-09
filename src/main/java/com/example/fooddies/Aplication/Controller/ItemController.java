package com.example.fooddies.Aplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.fooddies.Aplication.Entity.ItemEntity;
import com.example.fooddies.Aplication.Service.ItemService;

@RestController
@RequestMapping("/upload")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/upload-items")
    public String insertItem(ItemEntity item, MultipartFile file) {
        // Handle the file upload here using the `file` parameter
        // Save the file to the desired location or process it as needed
        // You can access the other form fields of `item` object as well

        itemService.saveItem(item);
        return "Item inserted successfully";
    }
}
