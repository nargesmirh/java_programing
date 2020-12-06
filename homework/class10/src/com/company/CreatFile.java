package com.company;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.util.Scanner;

public class CreatFile {

    File file1=new File("C:\\Users\\Rose\\IdeaProjects\\class10\\1.TEXT");
     File file2=new File("C:\\Users\\Rose\\IdeaProjects\\class10\\2.TEXT");
    String content="";
    public void  write() throws IOException {
        FileWriter fileWriter = new FileWriter(file2);
        fileWriter.write(content);

        fileWriter.close();

        System.out.println("file is write");

    }
    public void read() throws IOException {

        FileReader  fileReader = new FileReader(file1);
           int ascii = fileReader.read();
        while (ascii!=-1){
            content+=(char) ascii;
                ascii = fileReader.read();


        }
        System.out.println("file is read");
            fileReader.close();

    }


}
