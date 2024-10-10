package com.teachmeskills.lesson_4;

public class Task_3 {
    public static void main(String[] args) {
//        3. Создайте 2 массива из 5 чисел.
//        ведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        ообщите, что их средние арифметические равны).


        int[] firstArray = {10,1,12,3,14};
        int[] secondArray = {1,2,3,4,5};
        double averageValueFirstArray = 0.0;
        double averageValueSecondArray = 0.0;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
            averageValueFirstArray += firstArray[i];
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
            averageValueSecondArray += secondArray[i];
        }

        if (averageValueFirstArray > averageValueSecondArray) {
            System.out.printf("\nThe first arithmetic: %.2f \nThe second arithmetic: %.2f\n", averageValueFirstArray, averageValueSecondArray);
            System.out.println("The arithmetic mean of the first array is greater");
        }else if (averageValueFirstArray < averageValueSecondArray){
            System.out.println("The arithmetic mean of the second array is greater");
        }else {
            System.out.println("The arithmetic means are equal");
        }

    }
}
