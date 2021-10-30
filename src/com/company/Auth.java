package com.company;


class Auth {
    String phone;
    String email;
    String chekEmail = "^\\w+\\.?\\w+?@\\w+\\.\\w*\\.*\\w*";
    String checkPhone = "^[+]*[0-9]{1,4}[-\\s\\./0-9]*$";
    Coder coder = new Coder();
    void fillLogin(String login) {
        if (login.matches(this.chekEmail)) {
            this.sendCode();
            this.email = login;
        } else if (login.matches(this.checkPhone)) {
            this.phone = login;
            this.sendCode();
        } else {
            throw new IllegalArgumentException("Неверный логин");
        }
    }
    void sendCode() {
        this.coder.sendCode();
    }
    boolean checkCode(String code) {
        return this.coder.checkCode(code);
    }
}