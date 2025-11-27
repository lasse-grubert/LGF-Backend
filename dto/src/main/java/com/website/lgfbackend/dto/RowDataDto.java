package com.website.lgfbackend.dto;

import lombok.Data;

@Data
public class RowDataDto {
    private int rowId;
    private String arrivalTime;
    private String depatureTime;
    private String pauseTime;
    private String totalTime;
    private String date;
}
