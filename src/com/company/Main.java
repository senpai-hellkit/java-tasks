package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("reg / log: ");
        String inp = input.next();
        System.out.print("login: ");
        String login = input.next();
        System.out.print("password: ");
        String password = input.next();
        Auth auth = new Auth();
        if (inp.equals("log")){
            auth.login(login, password);
        } else {
            auth.register(login, password);
        }
    }
}
