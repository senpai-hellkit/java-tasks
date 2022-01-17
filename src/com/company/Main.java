package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Class parentClass = Test.class;
        int spaces = 0;

        while (parentClass != Object.class) {
            spaces += 2;
            int finalSpaces = spaces;

            System.out.println(parentClass.getName());
            System.out.println(Arrays.stream(parentClass.getConstructors())
                    .map(constructor -> " ".repeat(finalSpaces) + "- " + constructor)
                    .collect(Collectors.joining("\n")));
            System.out.println(Arrays.stream(parentClass.getFields())
                    .map(field -> " ".repeat(finalSpaces) + "+ " +field.getName())
                    .collect(Collectors.joining("\n")));
            System.out.println(Arrays.stream(parentClass.getDeclaredMethods())
                    .map(field -> " ".repeat(finalSpaces) + "* " +field)
                    .collect(Collectors.joining("\n")));

            parentClass = parentClass.getSuperclass();
        }
    }
}


class Test {
    public int age;
    public Test(int age) {
        this.age = age;
    }
    public String getInfo() {
        return "age: " + this.age;
    }
}

class Test1 extends Test {
    public String name;
    public String lastName;
    public Test1(int age, String name, String lastName) {
        super(age);
        this.name = name;
        this.lastName = lastName;
    }
    public String getInfo() {
        return "test name: " + this.name +
                " last name: " + this.lastName +
                " age: " + this.age;
    }
}