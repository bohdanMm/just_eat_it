package com.mykhalchuk.just_eat_it.repository;

import com.mykhalchuk.just_eat_it.domain.entity.DailyDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyDishRepository extends JpaRepository<DailyDish, Long> {
}
