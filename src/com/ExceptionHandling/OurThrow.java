package com.ExceptionHandling;

public class OurThrow {
    public static void main(String[] args) {

        // default throw and default catch
//        int[] arr={1,2,3,4,5};
//        System.out.println(arr[8]);

        //default throw and our catch
//        int[] arr={1,2,3,4,5};
//        try{
//            System.out.println(arr[8]);
//            System.out.println("I'm exist");
//        }
//        catch (ArrayIndexOutOfBoundsException obj){
//            System.out.println("Exception: "+obj.getMessage());
//        }
//        finally {
//            System.out.println("I'm here");
//        }


        // our throw and default catch

//        int[] arr={1,2,3,4,5};
//
//
//        if (arr.length <10){
//            throw new ArrayIndexOutOfBoundsException("6 index can't be accommodate");
//        }
//        System.out.println("Works fine");

            // our throw and our catch

        int[] arr={1,2,3,4,5};

       try {
           if (arr.length < 10) {
               throw new ArrayIndexOutOfBoundsException("6 index can't be accommodate");
           }
           System.out.println("No exception");
       }

       catch (ArrayIndexOutOfBoundsException obj){
           System.out.println("Exception: "+obj.getMessage());

       }












    }



}
