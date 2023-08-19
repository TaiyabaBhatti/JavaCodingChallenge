package com.ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class DefferentExceptions {
    public static void main(String[] args) {
//  You will be given two integers  and  as input, you have to compute .
//  If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it.
// Read sample Input/Output to know what to report in case of exceptions.


        Scanner sc=new Scanner(System.in);
        try{

            int num1=sc.nextInt();
            int num2= sc.nextInt();
            int result=num1/num2;
            System.out.println("Division : "+result);
        }
catch (ArithmeticException obj){

//    obj.printStackTrace();
    System.out.println(obj.toString());
}
        catch (InputMismatchException obj){

            System.out.println(obj.toString());


        }
        finally {
            System.out.println("Programe end.");
        }



    }




}
