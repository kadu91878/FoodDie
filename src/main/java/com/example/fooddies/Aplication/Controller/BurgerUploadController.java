package com.example.fooddies.Aplication.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddies.Aplication.Request.BurgersUploadRequest;
import com.example.fooddies.Domain.Model.BurgerModel;
import com.example.fooddies.Domain.Usecases.BuscarBurgersUploadUC;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/burgers")
@RequiredArgsConstructor
public class BurgerUploadController {
    final private BuscarBurgersUploadUC buscarBurgersUploadUC;

  @PostMapping("/uploadBurgers")
  public ResponseEntity<List<BurgerModel>> getUpload(@RequestParam BurgersUploadRequest request) {
    System.out.println("request:" +request);
    return new ResponseEntity<>(buscarBurgersUploadUC.execute(request), HttpStatus.OK);
  } 
}
