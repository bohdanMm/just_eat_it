package com.mykhalchuk.just_eat_it.domain.dto;

import com.mykhalchuk.just_eat_it.domain.enums.Gender;
import com.mykhalchuk.just_eat_it.domain.enums.TrainingRate;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MainUserDto {

    private Long id;

    @NotNull
    private String fullName;

    @NotNull
    private Integer age;

    @NotNull
    private Integer height;

    @NotNull
    private Integer weight;

    @NotNull
    private String email;

    @NotNull
    private String gender;

    @NotNull
    private String trainingRate;

    @NotNull
    private Integer dailyCalories;

    @NotNull
    private BigDecimal bodyMassIndex;
}
