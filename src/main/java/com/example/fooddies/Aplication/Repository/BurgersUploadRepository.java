package com.example.fooddies.Aplication.Repository;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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

        MapSqlParameterSource parameters = new MapSqlParameterSource();

        if (request.getName() != null && request.getName() != "") {
            sql += "(:name, ";
            parameters.addValue("name", request.getName());
        }
        if (request.getPicture() != null && request.getPicture() != "") {
            sql += ":picutre, ";
            parameters.addValue("picture", request.getPicture());
        }
        if (request.getInstructions() != null && request.getInstructions() != "") {
            sql += ":instructions, ";
            parameters.addValue("instructions", request.getInstructions());
        }
        if (request.getIngredients() != null && request.getIngredients() != "") {
            sql += ":ingredients, ";
            parameters.addValue("ingredients", request.getIngredients());
        }
        if (request.getDescription() != null && request.getDescription() != "") {
            sql += ":description)";
            parameters.addValue("description", request.getDescription());
        }

        Query query = entityManager.createNativeQuery(sql, BurgerEntity.class);

        query.executeUpdate();

        System.out.println(sql);

        @SuppressWarnings("unchecked")
        List<BurgerModel> resultList = query.getResultList();

        return resultList;

    }
}
