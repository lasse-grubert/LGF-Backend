package com.website.lgfbackend.dto;

import lombok.Data;


@Data
public class TimeResponseDto {
    private String depatureTime;

    public TimeResponseDto(String totalTime) {
        this.depatureTime = totalTime;
    }
}
