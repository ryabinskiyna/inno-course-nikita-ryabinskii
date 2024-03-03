package ru.inno.course.intermediateCertification2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate lastWateringDate = LocalDate.of(2024, 3, 1); // Пример даты последнего полива
        Cactus cactus = new Cactus(lastWateringDate);
        LocalDate nextWateringDate = cactus.getNextWateringDate();
        System.out.println("В следующий раз нужно полить кактус: " + nextWateringDate);
    }
}
