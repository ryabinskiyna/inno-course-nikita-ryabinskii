package ru.inno.course.intermediateCertification2;

import java.util.Random;

public class Sensor {
    public static int getHumidity() {
        // Генерируем случайное значение влажности воздуха от 0 до 100
        Random random = new Random();
        return random.nextInt(101);
    }
}
