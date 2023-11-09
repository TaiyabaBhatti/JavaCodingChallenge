package com.W3Resourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exe16 {

    public static void main(String[] args) {

        // Write a Java program to get the contents of a given string as a byte array.

        String str="Gratitude being evvolve";
        byte[] bytearray = str.getBytes();
        String str2=new String(bytearray);

        System.out.println(Arrays.toString(bytearray));
        System.out.println(str);






    }


}
