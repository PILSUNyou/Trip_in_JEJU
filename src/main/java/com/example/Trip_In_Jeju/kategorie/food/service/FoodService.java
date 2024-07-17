package com.example.Trip_In_Jeju.kategorie.food.service;

import com.example.Trip_In_Jeju.kategorie.food.entity.Food;
import com.example.Trip_In_Jeju.kategorie.food.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;
    public List<Food> getList() {
        return foodRepository.findAll();
    }

    public void create(String title, String content, String place) {
        Food p = Food.builder()
                .title(title)
                .content(content)
                .place(place)
                .build();
        foodRepository.save(p);
    }

    public Food getFood(Long id) {
        Optional<Food> food = foodRepository.findById(id);
        return food.get();
    }
}
