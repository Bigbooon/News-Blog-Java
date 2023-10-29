package com.example.mainpage;

import java.io.*;

public class createFolder {
    final String name;
    File file;

    public createFolder(String text) {
        this.name = text;
    }

    public void Folder(){

        File folder = new File("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\UsersData");
//        folder.mkdir();

    }
    public void addFile() throws Exception {

        Folder();

        file = new File( "C:\\Users\\Acer\\OneDrive\\Рабочий стол\\UsersData\\" + name + ".txt");

//        try (FileWriter fw = new FileWriter(file);
//             BufferedWriter bw = new BufferedWriter(fw)) {
//            bw.write(name);
//            bw.newLine(); // add new line, System.lineSeparator()
//        }

        try{
            file.createNewFile();

        }catch(IOException ex){
            throw new Exception("\nError");
        }
    }
}

