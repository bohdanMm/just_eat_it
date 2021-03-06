package com.mykhalchuk.just_eat_it.domain.dto.dish;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DishDto {

    private Long id;

    private String name;

    private String pictureUrl;

    private Integer calories;

    private List<DishIngredientDto> dishIngredients;

}
