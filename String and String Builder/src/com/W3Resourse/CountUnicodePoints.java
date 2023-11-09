package com.W3Resourse;

public class CountUnicodePoints {
    public static void main(String[] args) {

        //Write a Java program to count Unicode code points in the specified text range of a string.

        String str="Ambiva#lent23.";

            byte count=(byte)str.codePointCount(0,9);     // 9th index not be included

        System.out.println("Count Unicode code points in the specified text range: "+count);













         }


    }

