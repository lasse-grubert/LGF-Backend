package com.website.lgfbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeCalcRequestDto {

    private String startTime;
    private String workTime;
    private String pauseTime;

}
