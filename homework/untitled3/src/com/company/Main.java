package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //tamrin3manzel
        double x=0,y=0;
        final int e=5;
        final int f=8;
        long  a,b,c,d;
        System.out.print("enter first number:");
        Scanner input=new Scanner(System.in);
        a=input.nextLong();
        System.out.print("enter second number:");
        Scanner s=new Scanner(System.in);
        b=s.nextLong();
        System.out.print("enter third number:");
        Scanner inputs=new Scanner(System.in);
        c=inputs.nextLong();
        System.out.print("enter fourth number:");
        Scanner put=new Scanner(System.in);
        d=put.nextLong();

        //(a*x)+(b*y)==e;
        //(c*x)+(d*y)==f;
        if(a/c!=b/d){

            x=(e*d-b*f)/(a*d-b*c);
            System.out.println(x);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println(y);
        }
        else{
            System.out.println("error");
        }
	// write your code here
    }
}
