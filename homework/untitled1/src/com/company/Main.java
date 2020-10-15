package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,h,w,d,area=0,enviroment=0;
        System.out.print("enter the high");
        Scanner input= new Scanner(System.in);
        h=input.nextInt();
        System.out.print("enter the width");
        Scanner s= new Scanner(System.in);
        w=s.nextInt();
        System.out.print("if you want rectangle press 1,else(square) press 2");
        Scanner l= new Scanner(System.in);
        d=l.nextInt();
        switch(d){
            case 1:
                area=h*w;
                enviroment=(h+w)*2;
                System.out.println("the area is:" + area);
                System.out.print("the enviroment is:" + enviroment);
                break;
            case 2:
                if(h==w){
                    area=h*w;
                    enviroment=h*4;
                    System.out.println("the area is:" + area);
                    System.out.print("the enviroment is:" + enviroment);
                }
                else{
                    System.out.print("error");
                }
                  break;



        }

    }
}
