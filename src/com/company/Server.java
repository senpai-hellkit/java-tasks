package com.company;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Server {
    private final char[] hexArray = "0123456789ABCDEF".toCharArray();

    void auth(String arg, String pwd) {
        if (verify(arg, pwd)) {
            System.out.println("Auth");
        } else {
            System.out.println("Попробуйте еще раз");
        }
    }

     boolean verify(String login, String password){
        BufferedReader br = null;
        String pwd = "";
         try {
             pwd = generateHash(password);
         } catch (NoSuchAlgorithmException e) {
             e.printStackTrace();
         }
         try {
            br = new BufferedReader(new FileReader("login-password.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (login.equals(line.split(" - ")[0]) && pwd.equals(line.split(" - ")[1])){
                    return true;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }

     String coder(String pwd) {
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
            hexChars[i * 2] = this.hexArray[v >>> 4];
            hexChars[i * 2 + 1] = this.hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    void writeData(String login, String password) {
        try (FileWriter file = new FileWriter("login-password.txt", true);
             BufferedWriter br = new BufferedWriter(file);
             PrintWriter pw = new PrintWriter(br);)
        {
            pw.println(login + " - " + coder(password));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
