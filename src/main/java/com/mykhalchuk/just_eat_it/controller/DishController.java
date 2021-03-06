package com.mykhalchuk.just_eat_it.controller;

import com.mykhalchuk.just_eat_it.domain.dto.dish.DishCreationDto;
import com.mykhalchuk.just_eat_it.domain.dto.dish.DishDto;
import com.mykhalchuk.just_eat_it.domain.dto.dish.DishShortInfoDto;
import com.mykhalchuk.just_eat_it.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/dish")
public class DishController {

    private final DishService dishService;

    @GetMapping("all")
    public List<DishShortInfoDto> getDishes(){//todo add filters
        return dishService.getDishes();
    }

    @GetMapping("{id}")
    public DishDto getById(@PathVariable Long id){
        return dishService.getDtoById(id);
    }

    @GetMapping("daily-dish/{id}")
    public DishDto getDailyDishById(@PathVariable Long id){
        return dishService.getDailyDishDtoById(id);
    }

    @PostMapping("create")
    public void create(@RequestBody DishCreationDto dishCreationDto){
        dishService.create(dishCreationDto);
    }

    @GetMapping("substitute/{dailyDishId}")
    public List<DishDto> getSubstitute(@PathVariable Long dailyDishId){
        return dishService.getSubstituteForDailyDish(dailyDishId);
    }
}
