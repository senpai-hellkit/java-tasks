package com.company;

/*
### Задача 15. Стоимость: 10 баллов.
    Определить, является ли шаг между соседними элементами массива чётным
    [1, 3, 5] → true
    [1, 2, 3] → false
    [1, 2, 4] → false
    Входные параметры: размер массива, массив
    Выходные параметры: boolean
 */

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    private static final Scanner in = new Scanner(System.in);
    protected static int n;
    protected static int[] arr;

    TaskOne (String text, int age) {
        System.out.println(text + age);
    }

    public static void getData() {
        System.out.print("Кол-во эл в массиве: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Эл массива: ");
            arr[i] = in.nextInt();
        }
    }

    public static void show() {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.print(']');
    }

    public static boolean even() {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index++;
            if (index == arr.length) {break;}
            if ((arr[index] - arr[i]) % 2 == 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main() {
        getData();
        show();
        System.out.println(" -> " + even());
    }
}
