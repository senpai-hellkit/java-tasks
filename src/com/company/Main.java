package com.company;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        Class<TaskOne> taskOneClass = TaskOne.class;
        final Method[] methods = taskOneClass.getDeclaredMethods();
        final Field[] fields = taskOneClass.getDeclaredFields();
        System.out.println(" - " + taskOneClass.getName());
        for (Field field : fields) {
            System.out.println("  + " + field.getName());
        }
        for (Method method : methods) {
            System.out.println("  * " +  method.getName());
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
