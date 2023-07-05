package com.example.fooddies.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fooddies.Model.BurgerModel;
import com.example.fooddies.Repository.BurgersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BurgersService {
    
    final private BurgersRepository repo;

    private List<BurgerModel> buscarBurger(){
        return repo.findBurgers();
    }
}
