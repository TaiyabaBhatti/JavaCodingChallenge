package com.W3Resourse;

import java.lang.String;
import java.util.stream.IntStream;

public class GetCharacterUnicode {
    public static void main(String[] args) {

        //2. Write a Java program to get the character (Unicode code point) at the given index within the string.

        String str="Magnificent";
        System.out.println("What is the Unicode of specific character "+getChar(str,(byte)7)+" "+getCharCode(str,(byte)7));


    }

    public static byte getCharCode(String argu, byte index){

        byte uniCode =(byte)argu.codePointAt(index);

//        byte uniCode = (byte)argu.charAt(index);

        return    uniCode;
    }
    public static char getChar(String argu, byte index){
        char ch=argu.charAt(index);
        return ch;
    }

}
