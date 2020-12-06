package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        CreatFile creatFile=new CreatFile();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                try {
                    creatFile.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {

                try {
                    creatFile.write();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();

	// write your code here
    }
}
