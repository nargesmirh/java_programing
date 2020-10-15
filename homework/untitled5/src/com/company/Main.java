package com.company;

public class Main {


    public static void main(String[] args) {
        double delta=0;
        try {
            Delta ch =new Delta();
            ch.Accounting(delta);
            System.out.println("delta<0");
        }

        catch (Exception e){

            System.out.println(e);
            e.getMessage();
           e.getClass();

        }

	// write your code here



    }
}
