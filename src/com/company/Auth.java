package com.company;


class Auth {
    String chekEmail = "^\\w+\\.?\\w+?@\\w+\\.\\w*\\.*\\w*";
    void login(String login, String password) {
        if (login.matches(this.chekEmail)) {
            Server server = new Server();
            server.auth(login, password);
        } else {
            throw new IllegalArgumentException("Неверный логин");
        }
    }

    void register(String login, String password) {
        if (login.matches(this.chekEmail)) {
            Server server = new Server();
            if (server.verify(login, password)) {
                System.out.println("You have registration in this app");
            } else {
                server.writeData(login, password);
                System.out.println("Вы успешно зарегистрировались");
            }
        }
    }
}