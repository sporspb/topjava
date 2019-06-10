package ru.javawebinar.topjava.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static DateTimeFormatter getFormatter() {
        return formatter;
    }

    public static void setFormatter(DateTimeFormatter formatter) {
        TimeUtil.formatter = formatter;
    }

    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
