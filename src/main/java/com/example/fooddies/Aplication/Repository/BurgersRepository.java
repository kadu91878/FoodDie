package com.example.fooddies.Aplication.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.fooddies.Aplication.Entity.BurgerEntity;
import com.example.fooddies.Domain.Model.BurgerModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class BurgersRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<BurgerModel> findBurgers(){
        String sql = " select * from postgres.public.recipes r  ";

        Query query = entityManager.createNativeQuery(sql, BurgerEntity.class);

         @SuppressWarnings("unchecked")
        List<BurgerModel> resultList = query.getResultList();

        return resultList;

    }
}
