package com.company;

import java.util.Scanner;
//ax^2+bx+c=0;
public class Delta extends Exception {
    public Delta(String msg) {
        super(msg);
    }

    public Delta() {

    }

        double a,b,c,delta,x1,x2;

        public void Accounting(double delta)throws Delta{
            System.out.println("enter amount of a,b,c:");
            Scanner input=new Scanner(System.in);
            a=input.nextDouble();
            b=input.nextDouble();
            c=input.nextDouble();
            System.out.println(delta=Math.pow(b,2) -4*a*c);
            if (delta<0){
                System.out.println("start process");
                throw new Delta("x1,x2 is not available");

                }
            else {
                x1=(-b+Math.sqrt(delta))/2*a;
                x2=(-b-Math.sqrt(delta))/2*a;
                System.out.println(x1);
                System.out.println(x2);


            }
            System.out.println("end process");
        }


}
