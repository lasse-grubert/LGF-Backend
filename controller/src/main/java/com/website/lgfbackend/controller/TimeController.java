package com.website.lgfbackend.controller;


import com.website.lgfbackend.dto.TimeRequestDto;
import com.website.lgfbackend.dto.TimeResponseDto;
import com.website.lgfbackend.service.TimeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @PostMapping("/calculate")
    public TimeResponseDto calculate(@RequestBody TimeRequestDto request) {
        String total = timeService.calculateFinalTime(request.getTime1(), request.getTime2(), request.getTime3());
        return new TimeResponseDto(total);
    }
}

