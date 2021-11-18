package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Задание на эту пару. Написать любым способом прогу, которая будет:
1. Выдавать случайного студента вашей группы
2. Ждать оценку от 1 до 5 в консоль
3. После выдавать следующего студента

Также должен быть вывод всех студентов с оценкой при вводе в консоль "print"
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Вася");
        students.add("Дима");
        students.add("Леша");
        students.add("Игорь");
        students.add("Миша");
        students.add("Рудик");
        students.add("Тузик");
        students.add("Боби");
        students.add("Адам");
        students.add("Джесси");
        Scanner in = new Scanner(System.in);
        Collections.shuffle(students);
        int index;
        String mark = "print";
        while (!mark.equals("exit")) {
            index = getIdStudent(students);
            System.out.println(students.get(index));
            System.out.print("Что поставим? : ");
            mark = in.next();
            logistic(mark, index, students);
        }

    }

    static int getIdStudent(ArrayList<String> arr) {
        return (int)Math.floor(Math.random() * arr.size());
    }

    static void logistic(String arg, int index, ArrayList<String> arr) {
        if (arg.equals("print")) {
            System.out.println(arr.toString());
        } else {
            arr.set(index, arr.get(index) + " " + arg);
        }
    }
}
