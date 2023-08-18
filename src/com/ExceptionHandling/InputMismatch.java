package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
float num;
   try {
   num = sc.nextFloat();
    System.out.println(num);
    }
   catch (InputMismatchException obj){

       System.out.println("Exception: "+obj.getMessage());
   }
   finally {

       System.out.println("Try again:");

   }

    }
}
