package com.example.fooddies.Aplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooddies.Aplication.Entity.ItemEntity;
import com.example.fooddies.Aplication.Repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void saveItem(ItemEntity item) {
        itemRepository.save(item);
    }
}