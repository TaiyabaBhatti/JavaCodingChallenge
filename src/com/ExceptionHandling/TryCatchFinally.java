package com.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        // Throwable class ->(1/2) Exception class ->(1/*) RuntimeException ->(*) AirthmaticException amny more

        // try, catch and finally
        // There should be only one finally.
        //* finally will continuously print if default Exception catch mechanism run.
        // There will be more than one catch

        try{
            System.out.println(3/0);
        }
        catch (ArithmeticException obj){

            System.out.println("Exception: "+obj.getMessage());
        }
//        System.out.println("hello");        will not print after defalut catch mechanism
       finally {
            System.out.println("It will be mandatory for me to print.");
        }


        int[] arr={3,4,5,6};
        try{
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException obj){

            System.out.println("Exception: "+obj.getMessage());
        }
//        System.out.println("hello");        will not print after defalut catch mechanism
       finally {
            System.out.println("It will be mandatory for me to print.");
        }





    }
}
