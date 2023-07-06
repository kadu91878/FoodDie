package com.example.fooddies.Aplication.Gateway;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fooddies.Aplication.Request.BurgersUploadRequest;
import com.example.fooddies.Aplication.Service.BurgerUploadService;
import com.example.fooddies.Domain.Model.BurgerModel;
import com.example.fooddies.Domain.Usecases.BuscarBurgersUploadUC;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BurgerUploadGateway implements BuscarBurgersUploadUC.Output {
    private final BurgerUploadService service;

    public List<BurgerModel> findUpload(BurgersUploadRequest request){
        return this.service.findUpload(request);
    }
}
