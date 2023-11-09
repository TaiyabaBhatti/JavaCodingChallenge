package com.W3Resourse;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {

        //Write a Java program to concatenate a given string to the end of another string.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings");
        String str1=sc.nextLine();    //Input a complete sectence
        String str2=sc.next();       // Input only a single word

        System.out.println("Concatenation of Strings:  "+concatenate(str1,str2));

    }

    public static String concatenate(String argu1,String argu2){

        return argu1.concat(argu2);

    }

}
