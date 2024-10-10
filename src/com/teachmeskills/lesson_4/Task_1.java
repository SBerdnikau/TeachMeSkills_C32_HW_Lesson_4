package com.teachmeskills.lesson_4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//        1. Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//        выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.

        int[] array = {7, 4, 87, 4, 5, 6, 77, 100, 1};
        int countElements = 0;
        boolean isFlag = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a numerical value: ");
        int foundNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == foundNumber) {
                countElements++;
                isFlag = true;
            }
        }

        if (!isFlag) {
            System.out.printf("The number %d is not found in the array ", foundNumber);
            return;
        }
        
       int[] newArray = new int[array.length - countElements];
       countElements = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] != foundNumber ){
                newArray[countElements] = array[j];
                countElements++;
            }
        }

        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int item : newArray) {
            System.out.print(item + " ");
        }




    }
}
