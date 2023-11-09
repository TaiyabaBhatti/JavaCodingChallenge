package com.W3Resourse;

import java.util.Scanner;

public class CheckSubstringContain {
    public static void main(String[] args) {

        // Write a Java program to test if a given string contains the specified sequence of char values

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String subString = sc.next();
        boolean check = sequenceOfChar(str,subString);

        System.out.println("Given String Contains "+subString+"( true/false): "+check);

    }

    public static boolean sequenceOfChar(String argu1,String subString){

        if (!argu1.contains(subString)){
            return false;
        }
        return true;
    }
}
