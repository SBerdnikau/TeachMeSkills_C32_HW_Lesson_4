package com.teachmeskills.lesson_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
//        2. Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random().
//         Пусть будет возможность создавать массив произвольного размера.
//        Пусть размер массива вводится с консоли.

        System.out.println("Insert is a length array ");
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 188);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double averageValue = 0.0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            averageValue += array[i];
        }

        averageValue = averageValue / array.length;

        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.printf("\nMax value: %d \nMin value: %d \nAverage value: %.2f", max, min, averageValue);



    }
}
