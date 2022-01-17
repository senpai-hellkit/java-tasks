package com.company;

import java.lang.reflect.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println(TaskOne.class);
        Class<TaskOne> taskOneClass = TaskOne.class;
        final Method[] methods = taskOneClass.getDeclaredMethods();
        final Field[] fields = taskOneClass.getDeclaredFields();
        final taskOneClass.getDeclaredClasses();
        for (Field field : fields) {
            System.out.println(field);
        }
        for (Method method : methods) {
            System.out.println(method);
        }
//        System.out.println("\n######### task 1 ########\n");
//        TaskOne taskOne = new TaskOne();
//        taskOne.main();
//        System.out.println("\n######### task 2 ########\n");
//        TaskTwo taskTwo = new TaskTwo();
//        taskTwo.main();
//        System.out.println("\n######### task 3 ########\n");
//        TaskThree taskThree = new TaskThree();
//        taskThree.main();
//        System.out.println("\n######### task 4 ########\n");
//        TaskFour taskFour = new TaskFour();
//        taskFour.main();
//        System.out.println("\n######### task 5 ########\n");
//        TaskFive taskFive = new TaskFive();
//        taskFive.main();
    }
}
