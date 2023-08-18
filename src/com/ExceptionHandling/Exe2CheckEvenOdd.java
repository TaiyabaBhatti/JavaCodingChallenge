package com.ExceptionHandling;

public class Exe2CheckEvenOdd {
    public static void main(String[] args) {

//        Write a Java program to create a method that takes an integer as a parameter and
//        throws an exception if the number is odd.
         int num=7;
         try {
             checkForException(num);
         }
         catch (IllegalArgumentException obj){
//          obj.printStackTrace();           print out detailed explanation
     //        System.out.println(obj.toString());            only name and description not trace stack

         }

    }

    public static void checkForException(int argu){


            if (argu % 2 != 0) {
                throw new IllegalArgumentException("The Provided Number is odd");

            }

            else {

                System.out.println("The Number is Even");
            }
        }



    }

