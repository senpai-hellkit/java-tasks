package com.company;

/*
### Задача 12. Стоимость: 5 баллов.
    Вывести разницу между самым большим и самым маленьким числом в массиве
    Входные параметры: размер массива, массив
    Выходные параметры: целое число
 */

import java.util.Scanner;

public class TaskThree {
    private static final Scanner in = new Scanner(System.in);
    protected static int n;
    protected static int[] arr;

    public static void getData() {
        System.out.print("Кол-во эл в массиве: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Эл массива: ");
            arr[i] = in.nextInt();
        }
    }

    public static int MaxMinusMinInMassive() {
        int reSum;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        reSum = (max - min);
        return reSum;
    }

    public static void main() {
        getData();
        int result = MaxMinusMinInMassive();
        System.out.println(result);;
    }
}
