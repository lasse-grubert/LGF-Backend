package com.website.lgfbackend.controller;

import com.website.lgfbackend.dto.TimeCalcRequestDto;
import com.website.lgfbackend.service.TimeCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/time")
public class TimeCalculationController {
    private final TimeCalculationService timeService;

    @Autowired
    public TimeCalculationController(TimeCalculationService timeService) {
        this.timeService = timeService;
    }

    @PostMapping("/calculate-end")
    public String calculateEnd(@RequestBody TimeCalcRequestDto dto) {
        return timeService.calculateEndTime(dto);
    }
}

