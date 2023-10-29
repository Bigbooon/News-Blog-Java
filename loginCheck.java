package com.example.mainpage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class loginCheck {
    String name;
    String password;
    public boolean checkLogin(String text, String text2) throws IOException {
        this.name = text;
        this.password = text2;
        File f1 = new File("mainFile.txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        int count = 0;
        //Intialize the word to zero
        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" ");  //Split the word using space
            for (String word : words) {
                if (word.contains(this.name))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
                if (word.contains(this.password)) {
                    count++;
                }
            }
        }
        fr.close();
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
