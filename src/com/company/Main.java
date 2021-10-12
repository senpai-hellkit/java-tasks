package com.company;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nНачальный телефон\n");
        com.company.Phone phone = new com.company.Phone("+7459459859", "Telephone", 4853);
        phone.receivedCall("Петаног");
        phone.getNumber();
        phone.display();

        System.out.println("\nБабушка телефон\n");
        com.company.BabushkaPhone bPhone = new com.company.BabushkaPhone();
        bPhone.callToPerson();
        bPhone.getAllData();
        bPhone.setCharacteristics(new String[]{"Звонить", "Сбросить"});
        bPhone.setMenu(new String[]{"Набор номера"});
        bPhone.setPrice(230);
        bPhone.getAllData();

        System.out.println("\nСмарт телефон\n");
        com.company.SmartPhone sPhone = new com.company.SmartPhone();
        sPhone.getAllData();
        sPhone.setCharacteristics(new String[]{"Звонить", "Сбросить"});
        sPhone.setMenu(new String[]{"Набор номера"});
        sPhone.setPrice(23450);
        sPhone.getAllData();
        sPhone.getPhoto();
    }
}

/*
//Phone
//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона
//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать
 */

class Phone {
    protected String serialNumber;
    protected String model;
    protected int weight;

    Phone (String number, String model, int weight) {
        this.serialNumber = number;
        this.model = model;
        this.weight = weight;
    }

    Phone () {
        this.serialNumber = "+7495498557";
        this.model = "Petonog";
        this.weight = 600;
    }


    void receivedCall(String name) {
        System.out.println("Вам позвонил " + name);
    }

    void getNumber() {
        System.out.println(this.serialNumber);
    }

    void display() {
        System.out.printf("Телефон: %s\nМодель: %s\nВес %d\n", this.serialNumber, this.model, this.weight);
    }
}

class BabushkaPhone extends com.company.Phone {
    private int price;
    private String[] characteristics = new String[2];
    private String[] menu = new String[1];

    void receivedCall(String name) {
        System.out.println("Выкинь свой телефон, тебе звонит " + name);
    }

    void setPrice(int price){
        this.price = price;
    }

    void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }

    void setMenu(String[] menu) {
        this.menu = menu;
    }

    void getAllData() {
        System.out.printf("Цена: %d\nХарактеристики: %s\nМеню: %s\n", price, Arrays.toString(characteristics),
                Arrays.toString(menu));
    }

    void callToPerson() {
        System.out.println("Вы позвонили человеку!");
    }
}

class SmartPhone extends com.company.Phone {
    private int price;
    private String[] characteristics;
    private String[] menu;

    void setPrice(int price){
        this.price = price;
    }

    void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }

    void setMenu(String[] menu) {
        this.menu = menu;
    }

    void getAllData() {
        System.out.printf("Цена: %d\nХарактеристики: %s\nМеню: %s\n", price, Arrays.toString(characteristics),
                Arrays.toString(menu));
    }

    void getPhoto() {
        System.out.println("Сделали фото...");
    }
}
