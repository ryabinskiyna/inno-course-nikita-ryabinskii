package ru.inno.course.intermediateCertification2;

import java.time.LocalDate;
import java.time.Month;

public class Cactus {
    private LocalDate lastWateringDate;

    public Cactus(LocalDate lastWateringDate) {
        this.lastWateringDate = lastWateringDate;
    }

    public LocalDate getNextWateringDate() {
        LocalDate currentDate = LocalDate.now();
        if (isWinter(currentDate)) {
            return lastWateringDate.plusMonths(1);
        } else if (isSpringOrAutumn(currentDate)) {
            return lastWateringDate.plusWeeks(1);
        } else { // Лето
            int humidity = Sensor.getHumidity();
            if (humidity < 30) {
                return currentDate;
            } else {
                return lastWateringDate.plusDays(2);
            }
        }
    }

    private boolean isWinter(LocalDate date) {
        Month month = date.getMonth();
        return month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY;
    }

    private boolean isSpringOrAutumn(LocalDate date) {
        Month month = date.getMonth();
        return month == Month.MARCH || month == Month.APRIL || month == Month.MAY ||
                month == Month.SEPTEMBER || month == Month.OCTOBER || month == Month.NOVEMBER;
    }
}
