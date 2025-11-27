package com.website.lgfbackend.service;

import com.website.lgfbackend.service.helper.TimeCalculator;
import com.website.lgfbackend.service.helper.TimeFormatter;
import org.springframework.stereotype.Service;


@Service
public class TimeService {

    private final TimeCalculator timeCalculator = new TimeCalculator();
    private final TimeFormatter timeFormatter = new TimeFormatter();

    public String calculateFinalTime(String t1, String t2, String t3) {
        int totalMinutes = timeCalculator.calculateTotalMinutes(t1, t2, t3);
        return timeFormatter.formatTime(totalMinutes);
    }
}

