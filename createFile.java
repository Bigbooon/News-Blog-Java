package com.example.mainpage;
import java.io.File;
import java.io.IOException;

public class createFile {
     final String name;
     File file;
    public createFile(String name) {
        this.name = name;
    }

    public void addFile() throws IOException {

         file = new File("\"C:\\\\Users\\\\Acer\\\\OneDrive\\\\Рабочий стол\\\\UsersData\"" + name + ".txt");

          try{
                file.createNewFile();

            }catch(IOException ex){
                throw new IOException("\nError");
            }
        }}

