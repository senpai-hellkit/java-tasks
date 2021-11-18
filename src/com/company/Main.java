package com.company;

import java.io.*; // все пакеты юзаем
import java.util.Scanner;

/*
    Создать дубликат файла.
    то есть копию, ну вы поняли, создали копию файла, никто же не нажимает правой кнопкой чтобы создать копию
    по этому мне пришлось создать простую приложуху чтобы могли сделать копию, и то работает только с txt...
    также не уверен что корректно, так что забавно )
*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // считаем данные
        System.out.print("Название файла с учетом .txt: ");
        String fileName = input.next();
        String data = null; // создали null так как ну без него будет не хорошо.
        try {
            data = readData(fileName); // считали данные
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeData(fileName, data); // записали данные
    }

    // считываем содержимое файла в String с помощью BufferedReader
    static String readData(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader (fileName)); // экземпляр буффер ридера + файл ридера
        String line = null; // Строка для проверки
        StringBuilder list = new StringBuilder();  // создаем экземпляр builder`a
        String ls = System.getProperty("line.separator"); // Разделитель
        while((line = br.readLine()) != null) { // Считываем файл пока line != null
            list.append(line); // добавили линюю
            list.append(ls); // добавили separator
        }
        list.deleteCharAt(list.length()-1); // удаляем последний символ, чтобы не было пробела
        return list.toString(); // перевели в строку
    }

    static void writeData(String fileName, String data) {
        try (FileWriter file = new FileWriter("copy" + " " + fileName, true); // пытаемся создать файл
             BufferedWriter br = new BufferedWriter(file);  // опять риддер
             PrintWriter pw = new PrintWriter(br)) // ну и врайтер
        {
            pw.println(data); // записали данные
        }
        catch(IOException ex){
            System.out.println(ex.getMessage()); // вывели ошибку)
        }
    }
}