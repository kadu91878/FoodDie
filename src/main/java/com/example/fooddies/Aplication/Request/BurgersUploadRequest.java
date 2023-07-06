package com.example.fooddies.Aplication.Request;

import lombok.Data;

@Data
public class BurgersUploadRequest {

    private final String name;
    private final String picture;
    private final String instructions;
    private final String ingredients;
    private final String description;
}
