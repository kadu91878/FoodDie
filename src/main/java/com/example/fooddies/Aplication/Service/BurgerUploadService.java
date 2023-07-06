package com.example.fooddies.Aplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fooddies.Aplication.Repository.BurgersUploadRepository;
import com.example.fooddies.Aplication.Request.BurgersUploadRequest;
import com.example.fooddies.Domain.Model.BurgerModel;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BurgerUploadService {
     final private BurgersUploadRepository repository;

    public List<BurgerModel> findUpload(BurgersUploadRequest request) {
        return repository.findUpload(request);
    }
}
