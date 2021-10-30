package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class Coder {
    int maxLength = 6;
    private String code;
    private static Random rnd = new Random();
    public void sendCode() {
        char nextChar;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            nextChar = (char) (rnd.nextInt(26) + 97);
            sb.append(nextChar);
            if ((i + 1) % 5 == 0 && i != 5);
        }
        this.code = sb.toString();
        writeToFile(this.code);
    }
    static void writeToFile(String str) {
        try
        {
            FileWriter writer = new FileWriter("code.txt", false);
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    boolean checkCode(String code) {
        return (code.length() == this.maxLength && this.code.equals(code));
    }
}