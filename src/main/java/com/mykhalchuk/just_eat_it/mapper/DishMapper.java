package com.mykhalchuk.just_eat_it.mapper;

import com.mykhalchuk.just_eat_it.domain.dto.dish.DishCreationDto;
import com.mykhalchuk.just_eat_it.domain.dto.dish.DishDto;
import com.mykhalchuk.just_eat_it.domain.dto.dish.DishShortInfoDto;
import com.mykhalchuk.just_eat_it.domain.entity.Dish;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {DishIngredientMapper.class, DishCategoryMapper.class})
public interface DishMapper {

    DishShortInfoDto toShortDto(Dish dish);

    DishDto toDto(Dish dish);

    Dish toEntity(DishCreationDto dto);

    @AfterMapping
    default void afterToEntity(@MappingTarget Dish dish, DishCreationDto dto){
        dish.getDishIngredients()
                .forEach(dishIngredient -> dishIngredient.setDish(dish));
    }
}
