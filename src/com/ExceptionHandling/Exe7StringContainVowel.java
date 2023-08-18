package com.ExceptionHandling;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Exe7StringContainVowel {
    public static void main(String[] args) throws NoVowelFoundException {


        // Write a Java program to create a method that takes a string as
        // input and throws an exception if the string does not contain vowels.
        String str;
        try {
            str="hddagftctrn";
            containVowels(str);


        } catch (NoVowelFoundException obj) {
            System.out.println("Exception: "+obj.getMessage());
        }


    }

    public static void containVowels(String argu) throws NoVowelFoundException {
        String vowel = "aeiou";
        boolean status = false;
        for (int i = 0; i < argu.length(); i++) {
              char ch=argu.charAt(i);
              if (vowel.contains(String.valueOf(ch))){
                   status=true;
                   break;
                }
            }
        if (!status){
            throw new NoVowelFoundException("Vowels not found");
        }
    }
}

    class NoVowelFoundException extends Exception {
        NoVowelFoundException(String str) {
            super(str);
        }


    }

//        Scanner sc = new Scanner(System.in);
//        int str;
//        try{
//
//            if (!sc.hasNextInt()){
//                throw new ExceptionInInitializerError("Not an integer");
//
//            }
//        }
//        catch (ExceptionInInitializerError obj){
//            System.out.println("Exception: "+obj.getMessage());
//        }
