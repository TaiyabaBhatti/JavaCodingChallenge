package com.W3Resourse;

public class GetCharacter {

    public static void main(String[] args) {

        //Write a Java program to get the character at the given index within the string.

        String str="Sovereignty";
        System.out.println("What is the character at given index? "+getCharacter(str,(byte)5));


    }

    public static char getCharacter(String argu, byte index){

        char ch=argu.charAt(index);
        return ch;


    }

}
