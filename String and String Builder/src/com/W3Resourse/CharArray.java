package com.W3Resourse;

public class CharArray {
    public static void main(String[] args) {

        //11. Write a Java program to create a String object with a character array.


        char[] ch={'a','b','c','d'};

        String str = String.copyValueOf(ch,1,3);  // count is the length of the array it should be three chars
        System.out.println(str);









    }



}
