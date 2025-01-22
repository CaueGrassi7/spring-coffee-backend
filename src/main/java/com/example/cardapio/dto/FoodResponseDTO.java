package com.example.cardapio.dto;

import com.example.cardapio.entity.FoodEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public record FoodResponseDTO(
        @JsonProperty("id") Long id,
        @JsonProperty("title") String title,
        @JsonProperty("image") String image,
        @JsonProperty("price") Integer price
) {
    public FoodResponseDTO(FoodEntity food) {
        this(
                food.getId(),
                food.getTitle(),
                food.getImage(),
                food.getPrice()
        );
    }
}
