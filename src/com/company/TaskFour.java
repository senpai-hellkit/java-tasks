package com.company;

import java.util.Scanner;

/*
### Задача 9. Стоимость: 8 баллов.
    Даны два массива, вывести новый массив, который будет содержать в себе элементы заданных массивов
    [1, 2], [3, 4] → [1, 2, 3, 4]
    [4, 4], [2, 2] → [4, 4, 2, 2]
    [9, 2], [3, 4] → [9, 2, 3, 4]
    Входные параметры: размер 1го массива, 1й массив, размер 2го массива, 2й массив
    Выходные параметры: новый массив
 */

public class TaskFour {
    private static final Scanner in = new Scanner(System.in);
    protected static int lenFirst;
    protected static int lenSecond;
    protected static int[] arrFirst;
    protected static int[] arrSecond;

    public static void getData() {
        System.out.print("Кол-во эл в 1-м массиве: ");
        lenFirst = in.nextInt();
        arrFirst = new int[lenFirst];
        for (int i = 0; i < arrFirst.length; i++) {
            System.out.print("Эл массива: ");
            arrFirst[i] = in.nextInt();
        }
        System.out.print("Кол-во эл во 2-м массиве: ");
        lenSecond = in.nextInt();
        arrSecond = new int[lenSecond];
        for (int i = 0; i < arrSecond.length; i++) {
            System.out.print("Эл массива: ");
            arrSecond[i] = in.nextInt();
        }
    }

    public static void show(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.print(']');
    }

    public static int[] concat() {
        int[] result = new int[arrFirst.length + arrSecond.length];
        int idxFirst = 0;
        int idxSecond = 0;
        for (int i = 0; i < result.length; i++) {
            if (idxFirst < arrFirst.length) {
                result[i] = arrFirst[idxFirst];
                idxFirst++;
                continue;
            }
            if (idxSecond < arrSecond.length) {
                result[i] = arrSecond[idxSecond];
                idxSecond++;
            }
        }
        return result;
    }

    public static void main() {
        getData();
        int[] result = concat();
        show(arrFirst);
        System.out.print(", ");
        show(arrSecond);
        System.out.print(" -> ");
        show(result);
    }
}
