package com.ExceptionHandling;

public class Exe4NumberDuplicate {
    public static void main(String[] args) {


        //Write a Java program that reads a list of integers from the user and throws an exception
        // if any numbers are duplicates.

        int[] arr={1,9,7,3,2,8,6};
        try{

            checkDublicate(arr);

        }
        catch (ArrayStoreException obj){
            System.out.println("Exception: "+obj.getMessage());
        }










    }
    public static void checkDublicate(int[] argu){

        for (int i=0;i< argu.length-1;i++){
            for (int j=i+1;j< argu.length;j++){
                if (argu[i]==argu[j]){
                    throw new ArrayStoreException("Duplicate array elements");
                }

            }

        }

        System.out.println("No duplicate elements found!!Happy Coding");

    }


}
