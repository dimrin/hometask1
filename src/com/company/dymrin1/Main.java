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

            if (i % 3 == 0) {
                System.out.print("Hello. ");
            } else if (i % 5 == 0) {
                System.out.print("World. ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Hello World ");
            } else {
                System.out.print(i + " ");
            }

        }

        /*
        Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
        Вывести среднее арифметическое.
        */
        int firstNumber = 10;
        int lastNumber = 20;

        int firstRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int secondRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int thirdRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int fourthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int fifthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int sixthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int seventhRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int eighthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int ninthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));
        int tenthRandomNumber = firstNumber + (int) (Math.random() * ((lastNumber - firstNumber) + 1));

        int[] array = new int[]{firstRandomNumber, secondRandomNumber, thirdRandomNumber, fourthRandomNumber,
                fifthRandomNumber, sixthRandomNumber, seventhRandomNumber, eighthRandomNumber, ninthRandomNumber, tenthRandomNumber};
        System.out.println('\n');

        System.out.println(Arrays.toString(array));

        double[] newArray = new double[array.length];
        Arrays.setAll(newArray, arrayIndex -> (double) array[arrayIndex]);

        double average = 0;
        double sum = 0;
        for (double v : newArray) {
            sum += v;
        }
        average = sum / newArray.length;
        System.out.println(average);

        createString();

        createLongString();

    }

    /*
    Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
    Каждое число при этом взять в круглые скобки ().
    */
    public static String createString() {

        for (int i = 0; i <= 30; i++) {
            String newString = "(" + i + ")";
            System.out.print(newString);
        }
        return " ";
    }

    /*
    Написать метод который убирает лишние пробелы в строке и возвращает строку.
    */
    public static String createLongString() {

        String longString = " This  is  my  first  hometask ";
        StringBuilder stringBuilder = new StringBuilder(longString);
        stringBuilder.delete(0, 1);
        stringBuilder.delete(5, 6);
        stringBuilder.delete(7, 8);
        stringBuilder.delete(11, 12);
        stringBuilder.delete(17, 18);
        stringBuilder.delete(25, 26);

        longString = stringBuilder.toString();
        System.out.println('\n');
        System.out.println(longString);

        return "";
    }


}
