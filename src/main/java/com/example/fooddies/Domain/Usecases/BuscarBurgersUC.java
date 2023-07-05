package com.example.fooddies.Domain.Usecases;

import java.util.List;

import com.example.fooddies.Domain.Model.BurgerModel;

import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
@Named
public class BuscarBurgersUC {
    final private Output output;

    @SneakyThrows
    public List<BurgerModel> execute(){
        return output.findBurgers();
    }

    public interface Output {
        List<BurgerModel> findBurgers();
    }
}
