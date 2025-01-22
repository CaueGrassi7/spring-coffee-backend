package com.example.cardapio.entity;

import com.example.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public FoodEntity(FoodRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }

    public FoodEntity(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public FoodEntity() {
    }
}