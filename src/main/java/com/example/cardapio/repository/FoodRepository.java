package com.example.cardapio.repository;

import com.example.cardapio.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
}
