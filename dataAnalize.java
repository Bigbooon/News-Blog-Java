package com.example.mainpage;

import java.io.*;
import java.lang.String;

public class dataAnalize {

    final String name;
    final String email;
    final String password;
    boolean exists = true;
    boolean empty = false;
    boolean matching = false;

     dataAnalize(String text, String text1, String text2) {
        this.name = text;
        this.email = text2;
        this.password = text1;
    }

    public void save() throws IOException, Exception {
        try{

//            PrintWriter insert = new PrintWriter( "C:\\Users\\Acer\\OneDrive\\Рабочий стол\\UsersData\\" + name + ".txt");
//            insert.println("name:" + name);
//            insert.println("password:" + password);
//            insert.println("email:" + email);
//            insert.close();
            FileWriter fileWritter = new FileWriter("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\UsersData\\" + name + ".txt",true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            PrintWriter out = new PrintWriter(bw);
            out.println("name:" + name);
            out.println("password:" + password);
            out.println("email:" + email);
            out.close();
            bw.close();
            fileWritter.close();
            System.out.println("Save Done");

        }catch(FileNotFoundException ex){
            throw new FileNotFoundException("\nFile does not exist.");
        }
    }
    public void saveToMain() throws IOException, Exception {
        try{

//            PrintWriter insert = new PrintWriter( "mainFile.txt");
//            insert.println("name:" + name);
//            insert.println("password:" + password);
//            insert.println("email:" + email + "\n");
//            insert.close();


            FileWriter fileWritter = new FileWriter("mainFile.txt",true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            PrintWriter out = new PrintWriter(bw);
            out.println("\nname:" + name);
            out.println("password:" + password);
            out.println("email:" + email);
            out.close();
            bw.close();
            fileWritter.close();
            System.out.println("Save Main Done");

        }catch(FileNotFoundException ex){
            throw new FileNotFoundException("\nFile does not exist.");
        }
    }
    public boolean matchingTest() throws IOException  {
        File f1=new File("mainFile.txt");
        String[] words=null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
            words=s.split(" ");  //Split the word using space
            for (String word : words)
            {
                if (word.contains(this.name))   //Search for the given word
                {
                    return true;    //If Present increase the count by one
                }
            }
        }
        fr.close();
        return false;
    }
}
