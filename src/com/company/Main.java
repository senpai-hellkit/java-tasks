package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Auth auth = new Auth();
        Server server = new Server();

        System.out.print("login: ");
        String login = input.next();
        auth.fillLogin(login);
        System.out.print("code: ");
        String code = input.next();
        if (server.verify(login, code)) {
            server.auth(login, code);
        } else {
            server.tryAgain();
        }
    }
}
