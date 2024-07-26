package com.example.Trip_In_Jeju.Aitravel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class AiTravel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 여행지의 고유 ID
    private String name; // 여행지 이름
    private String description; // 여행지 설명
    private String category; // 여행지 카테고리 (예: 자연, 문화)
    private double rating; // 여행지 평점

}