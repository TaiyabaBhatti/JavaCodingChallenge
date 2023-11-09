package com.W3Resourse;

public class CompareStrings2 {
    public static void main(String[] args) {

        //Write a Java program to compare two strings lexicographically.
        //Two strings are lexicographically equal if they are the same length
        // and contain the same characters in the same positions.

        String str1="You are the man of Passion";
        String str2="You are the man of Passion";

        int status1 = str1.compareTo(str2);
        System.out.println("Two strings are lexicographically equal? "+status1);

        String str3="You are the Man of Passion";
        String str4="You are the man of passion";

        int status2 = str3.compareTo(str4);
        System.out.println("Two strings are lexicographically equal? "+status2);






    }
}
