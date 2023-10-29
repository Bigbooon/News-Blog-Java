package com.example.mainpage;

import java.io.*;

public class UpdateP {
    String password;


    public void changePassword(String text, String text2) throws IOException {
        this.password = "password:" + text;
        String newPass ="password:"+ text2;
        File f1 = new File("mainFile.txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" ");
            //Split the word using space
            for (String word : words) {
                System.out.println(word);
                if (word.equals(this.password)) {
                   word.replace(password, newPass);
                    System.out.println(word);
                }
            }
        }
        fr.close();

    }
    }

