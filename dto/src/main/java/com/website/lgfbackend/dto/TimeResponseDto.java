package com.website.lgfbackend.dto;

import lombok.Data;


@Data
public class TimeResponseDto {
    private String depatureTime;
    private int totalMinutes;

    public TimeResponseDto(String depatureTime, int totalMinutes) {
        this.depatureTime = depatureTime;
        this.totalMinutes = totalMinutes;
    }
}
