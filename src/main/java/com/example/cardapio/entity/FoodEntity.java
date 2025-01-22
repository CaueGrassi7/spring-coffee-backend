package com.example.cardapio.entity;

import com.example.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
