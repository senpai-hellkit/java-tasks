package com.company;

import java.util.Scanner;
/*
### Задача 6. Стоимость: 3 балла.
    Верните true, если за первым найденным символе "x" во введённой строке следует ещё один символ "x"
    "axxbb" → true
    "axaxax" → false
    "xxxxx" → true
    Входные параметры: строка длиной 1 и более
    Выходные параметры: boolean
*/

public class TaskFive {
    private static final Scanner in = new Scanner(System.in);
    protected static String text;
    protected static String letter = "x";

    public static void getData() {
        System.out.print("Текст: ");
        text = in.next();
    }

    public static boolean xInOrNot() {
        int count = 0;
        for (String s : text.split("")) {
            if (count > 1) {
                return true;
            }
            if (s.equals(letter)) {
                count++;
                continue;
            }
            count = 0;
        }
        return (count > 1) ? true : false;
    }

    public static void show() {
        System.out.print('"' + text + '"');
    }

    public static void main() {
        getData();
        show();
        System.out.print(" -> ");
        System.out.print(xInOrNot());
    }

}
