package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Server {
    private final char[] hexArray = "0123456789ABCDEF".toCharArray();

    void auth(String arg, String pwd) {
        if (verify(arg, pwd)) {
            System.out.println("Auth");
        } else {
            // todo: Продумать этот ход
            System.out.println("Try");
        }
    }

    boolean verify(String arg, String pwd) {
        // todo: верификацию из файла
        return true;
    }

    String coder(String pwd) {
        // todo: hash code password
        String password = null;
        try {
            password = generateHash(pwd);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return password;
    }

    private String generateHash(String pwd) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] hash = digest.digest(pwd.getBytes());
        return bytesToStringHex(hash);
    }

    public String bytesToStringHex(byte[] hash) {
        char[] hexChars = new char[hash.length * 2];
        for (int i = 0; i < hash.length; i++) {
            int v = hash[i] & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    void writeData(String login, String arg) {
        try
        {
            FileWriter writer = new FileWriter("code.txt", false);
            writer.write(login + " - " + coder(arg));
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    void tryAgain() {
    }
}
