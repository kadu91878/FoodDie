package com.example.fooddies.Aplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fooddies.Aplication.Repository.BurgersRepository;
import com.example.fooddies.Domain.Model.BurgerModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BurgersService {

    final private BurgersRepository repository;

    public List<BurgerModel> findBurgers() {
        return repository.findBurgers();
    }
}
