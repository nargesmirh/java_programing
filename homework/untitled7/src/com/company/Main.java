package com.company;

public class Main {

    public static void main(String[] args) {
        String ch=new String();
        try {
            Search str=new Search();
            str.searchstring(ch);
        }
        catch (Exception e){
            System.out.println(e);
            e.getMessage();
        }
	// write your code here
    }
}
