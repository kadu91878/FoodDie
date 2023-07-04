package com.example.fooddies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddies.Model.BurgerModel;
import com.example.fooddies.Repository.BurgersRepository;

@RestController
@RequestMapping("/burgers")
public class BurgersController {
    private final BurgersRepository burgersRepository;

    @Autowired
    public BurgersController(BurgersRepository burgersRepository) {
        this.burgersRepository = burgersRepository;
    }

    @GetMapping
    public List<BurgerModel> getBurgers() {
        return burgersRepository.findBurgers();
    }
}
