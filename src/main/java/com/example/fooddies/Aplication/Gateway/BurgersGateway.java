package com.example.fooddies.Aplication.Gateway;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fooddies.Aplication.Service.BurgersService;
import com.example.fooddies.Domain.Model.BurgerModel;
import com.example.fooddies.Domain.Usecases.BuscarBurgersUC;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BurgersGateway implements BuscarBurgersUC.Output {
    private final BurgersService service;

    public List<BurgerModel> findBurgers(){
        return this.service.findBurgers();
    }
}
