package com.website.lgfbackend.service.helper;

public class TimeCalculator {

    public int calculateTotalMinutes(String... times) {
        int totalMinutes = 0;
        for (String time : times) {
            totalMinutes += parseToMinutes(time);

        }
        if (totalMinutes > 1440) {
            return totalMinutes % 1440;
        }
        return totalMinutes;
    }

    private int parseToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
