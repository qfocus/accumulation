package com.plainpub.accumulation.date;

import java.time.LocalDate;
import java.util.Calendar;

public final class DateUtils {
    private DateUtils() {
    }

    public static LocalDate getLastDayOfCurrentMonth(String date) {
        LocalDate localDate = LocalDate.parse(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(localDate.getYear(), localDate.getMonth().getValue() - 1, localDate.getDayOfMonth());
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        LocalDate end = LocalDate.of(localDate.getYear(), localDate.getMonth(), lastDay);

        return end;
    }
}