package com.example.fooddies.Aplication.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddies.Domain.Model.BurgerModel;
import com.example.fooddies.Domain.Usecases.BuscarBurgersUC;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/burgers")
@RequiredArgsConstructor
public class BurgersController {
  final private BuscarBurgersUC buscarBurgersUC;

  @GetMapping("/getBurgers")
  public ResponseEntity<List<BurgerModel>> getBurgers(){
    return new ResponseEntity<>(buscarBurgersUC.execute(), HttpStatus.OK);
  }
}
