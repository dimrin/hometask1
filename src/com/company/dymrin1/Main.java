package com.company.dymrin1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Вывести ряд чисел от 1 до 100 через пробел с изменениями:

        - если число кратно 3 то вместо него вывести Hello

        - если число кратно 5 то вместо него вывести World

        - если число кратно и 3 и 5 то вместо него вывести Hello World

        символ "." добавлен для лучшего визуального восприятия правильности вывода слов
        */
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Hello World ");
            } else if (i % 5 == 0) {
                System.out.print("World. ");
            } else if (i % 3 == 0) {
                System.out.print("Hello. ");
            } else {
                System.out.print(i + " ");
            }

        }

        /*
        Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
        Вывести среднее арифметическое.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 11) + 10);
        }
        String arrayString = Arrays.toString(array);
        System.out.print('\n');
        System.out.print(arrayString);

        double[] newArray = new double[array.length];
        Arrays.setAll(newArray, arrayIndex -> (double) array[arrayIndex]);


        double sum = 0;
        for (double v : newArray) {
            sum += v;
        }
        double average = 0;
        average = sum / newArray.length;
        System.out.print('\n');
        System.out.println(average);

        System.out.println(createString());

    }

    /*
    Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
    Каждое число при этом взять в круглые скобки ().
    */

    public static String createString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= 30; i++) {
            result.append("(").append(i).append(")");
        }
        return result.toString();
    }


}
