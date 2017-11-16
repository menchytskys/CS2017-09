package by.it.sc04_evening_tue_thu.zhyravski.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Новый способ ввода данных + поиск минимума

Текущая реализация:
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача:
Программа вводит пять чисел с клавиатуры (через Enter) и выводит минимальное из них на экран.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку, которая начинается на "Minimum = ".
3. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class TaskB2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrOfNum = new int[5];


        for (int i = 0; i < 5; i++) {

            arrOfNum[i] = Integer.parseInt(reader.readLine());

        }

        int minimum = arrOfNum[0];

        for (int curNum : arrOfNum) {

            minimum = min(minimum, curNum);

        }

        System.out.println("Minimum = " + minimum);
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
