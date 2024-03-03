package ru.inno.course.intermediateCertification1;

import java.util.Scanner;

public class LoveConfession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим длину забора в см
        System.out.print("Введите длину забора (в см): ");
        int length = scanner.nextInt();

        // Вычисляем количество букв и пробелов
        int letters = 15;
        int spaces = 3;

        // Вычисляем общую длину надписи
        int totalLength = (letters / 3) * 62 + spaces * 12;

        // Проверяем, поместится ли надпись на заборе
        if (totalLength <= length) {
            System.out.println("Надпись поместится на заборе.");
        } else {
            System.out.println("Надпись НЕ поместится на заборе.");
        }

        scanner.close();
    }
}
