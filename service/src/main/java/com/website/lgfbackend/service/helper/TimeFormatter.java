package com.website.lgfbackend.service.helper;

public class TimeFormatter {

    public String formatTime(int totalMiutues) {

        if (totalMiutues > 1140){
            totalMiutues = totalMiutues % 1440;
        }

        int hours = totalMiutues / 60;
        int minutes = totalMiutues % 60;
        return String.format("%02d:%02d", hours, minutes);
    }
}
