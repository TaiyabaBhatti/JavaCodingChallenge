package com.W3Resourse;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter: ");
        String str= sc.nextLine();
        boolean status=check(str);
        System.out.println("Given String ends with eem,ncy or ful ? "+status);
    }

    public static boolean check(String str){
        if (str.endsWith("ful") || str.endsWith("eem")||str.endsWith("ncy")){

            return true;
        }

        return false;

    }


}
