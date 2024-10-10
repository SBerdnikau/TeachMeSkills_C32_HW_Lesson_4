package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
//        0. Создайте массив целых чисел. Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).

        int[] array = {7, 4, 87, 4, 5, 6, 77, 100, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a numerical value: ");
        int number = scanner.nextInt();

        for (int item : array) {
            if (item == number) {
                System.out.printf("The number %d is found in the array", number);
                return;
            }
        }

        System.out.printf("The number %d is not found in the array", number);

    }
}
