package com.W3Resourse;

public class GetCharacterUnicode2 {
    public static void main(String[] args) {

        //Write a Java program to get the character (Unicode code point) before the specified index within the string.

        String str = "Optimistic";
        int index=5;
        byte codebefore=(byte)str.codePointBefore(index);
        char chbefore=str.charAt(index-1);
        byte code=(byte)str.codePointAt(index);
        char ch=str.charAt(index);

        System.out.println("The character before "+ch +" of unicode "+code+" is "+chbefore+" of unicode "+codebefore);




    }
}
