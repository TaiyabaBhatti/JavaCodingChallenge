package com.ExceptionHandling;

public class ExeTryCatch {
    public static void main(String[] args) {
        //1. Write a Java program that throws an exception and catch it using a try-catch block.

        String str1="Abbreviated";

        try{
           System.out.println(str1.charAt(15));
           // the lower code not run if the upper one get acceptance
            if(str1.charAt(5)!='r'){
                throw new RuntimeException("My Exception");
            }

        }

        catch (RuntimeException ref){

            System.out.println("Exception: "+ref.getMessage());

        }

       finally {
            System.out.println("I'm always here");
        }





    }
}
