package com.website.lgfbackend.service;


import com.website.lgfbackend.dto.TimeCalcRequestDto;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCalculationService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public String calculateEndTime(TimeCalcRequestDto requestDto) {

        LocalTime startTime = LocalTime.parse(requestDto.getStartTime(), formatter);
        LocalTime workTime = LocalTime.parse(requestDto.getWorkTime(), formatter);
        LocalTime pauseTime = LocalTime.parse(requestDto.getPauseTime(), formatter);

        LocalTime result = startTime
                .plusHours(workTime.getHour())
                .plusMinutes(workTime.getMinute())
                .minusHours(pauseTime.getHour())
                .minusMinutes(pauseTime.getMinute());

        return result.format(formatter);
    }
}
