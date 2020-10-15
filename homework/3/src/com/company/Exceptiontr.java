
package com.company;

public class Exceptiontr extends Exception {

    public static void Persons() {
        Person per = new Person();
        int i;
        for (i=0;i< Person.n;i++){
            for (int j=0;j< Person.n;j++){
                if(per.id[i].equals(per.id[j])){
                    System.out.println("error");
                    break;
                }
            }
        }


    }

}

