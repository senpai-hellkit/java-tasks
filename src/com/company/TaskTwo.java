package com.company;

/*
### Задача 10. Стоимость: 5 баллов.
    Поменять местами 1й и последний элемент в массиве
    [1, 2, 3, 4] → [4, 2, 3, 1]
    Входные параметры: размер массива, массив
    Выходные параметры: новый массив
 */

import java.util.Scanner;

public class TaskTwo {
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

    public static void show(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.print(']');
    }

    public static int[] replaceFirstToLast() {
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = arr[arr.length-1];
                continue;
            }
            if (i+1 == arr.length){
                array[i] = arr[0];
                continue;
            }
            array[i] = arr[i];
        }
        return array;
    }

    public static void main() {
        getData();
        show(arr);
        int[] array = replaceFirstToLast();
        System.out.print(" -> ");
        show(array);
    }
}
