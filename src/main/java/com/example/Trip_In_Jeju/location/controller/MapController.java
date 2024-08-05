package com.example.Trip_In_Jeju.location.controller;

import com.example.Trip_In_Jeju.location.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
@RequiredArgsConstructor
public class MapController {

    private final LocationService locationService; // MyService를 주입받음

    @GetMapping("/map")
    public String showMap() {
        return "map/map"; // map.html 파일을 반환
    }
}