package com.example.fooddies.Aplication.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.fooddies.Aplication.Entity.BurgerEntity;
import com.example.fooddies.Aplication.Request.BurgersUploadRequest;
import com.example.fooddies.Domain.Model.BurgerModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class BurgersUploadRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<BurgerModel> findUpload(BurgersUploadRequest request) {
        String sql = "INSERT INTO recipes (name, picture, instructions, ingredients, description) VALUES";
        if (request.getName() != null && request.getName() != "") {
            sql += "(':name', ";
        }
        if (request.getPicture() != null && request.getPicture() != "") {
            sql += "':picutre', ";
        }
        if (request.getInstructions() != null && request.getInstructions() != "") {
            sql += "':instructions', ";
        }
        if (request.getIngredients() != null && request.getIngredients() != "") {
            sql += "':ingredients', ";
        }
        if (request.getDescription() != null && request.getDescription() != "") {
            sql += "':description')";
        }

        Query query = entityManager.createNativeQuery(sql, BurgerEntity.class);

        if (request.getName() != null && request.getName() != "") {
            query.setParameter("name", request.getName());
        }
        if (request.getPicture() != null && request.getPicture() != "") {
            query.setParameter("picture", request.getPicture());
        }
        if (request.getInstructions() != null && request.getInstructions() != "") {
            query.setParameter("instructions", request.getInstructions());
        }
        if (request.getIngredients() != null && request.getIngredients() != "") {
            query.setParameter("ingredients", request.getIngredients());
        }
        if (request.getDescription() != null && request.getDescription() != "") {
            query.setParameter("description", request.getDescription());
        }

        query.executeUpdate();

        System.out.println(sql);

        @SuppressWarnings("unchecked")
        List<BurgerModel> resultList = query.getResultList();

        return resultList;

    }
}
