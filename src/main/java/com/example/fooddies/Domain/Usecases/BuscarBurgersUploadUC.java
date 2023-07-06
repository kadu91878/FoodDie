package com.example.fooddies.Domain.Usecases;

import java.util.List;

import com.example.fooddies.Aplication.Request.BurgersUploadRequest;
import com.example.fooddies.Domain.Model.BurgerModel;

import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;


@RequiredArgsConstructor
@Named
public class BuscarBurgersUploadUC {
     final private Output output;

    @SneakyThrows
    public List<BurgerModel> execute(BurgersUploadRequest request){
        return output.findUpload(request);
    }

    public interface Output {
        List<BurgerModel> findUpload(BurgersUploadRequest request);
    }
}
