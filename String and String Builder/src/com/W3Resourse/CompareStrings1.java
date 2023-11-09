package com.W3Resourse;

public class CompareStrings1 {
    public static void main(String[] args) {

        //6. Write a Java program to compare two strings lexicographically, ignoring case differences.

        String str1="disipline should be Mandatory";
        String str2="Disipline should be mandatory";

        System.out.println("Are "+str1+" and "+str2+" equal(Ignore case Difference): "+status(str1,str2));

        str1="disipline should be Mandatory";
        str2="Diuipline should be mandatory";    //inserting u in word Disipline

        System.out.println("Are "+str1+" and "+str2+" equal(Ignore case Difference): "+status(str1,str2));



    }

    public static int status(String argu1,String argu2){

        int status=argu1.compareToIgnoreCase(argu2);



        return status;



    }



}
