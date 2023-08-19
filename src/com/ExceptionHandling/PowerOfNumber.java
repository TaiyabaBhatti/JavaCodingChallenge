package com.ExceptionHandling;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) throws Exception {

        int i=3/0;
        System.out.println(i);





//        Scanner sc=new Scanner(System.in);
//        MyCalculator calculator=new MyCalculator();
//
//       while (sc.hasNextInt()){
//            int base = sc.nextInt();
//            int toPower = sc.nextInt();
//            try {
//                long result = calculator.computePower(base, toPower);
//                System.out.println("Result : " + result);
//            } catch (Exception obj) {
//
//                System.out.println(obj.toString());
//
//            }
//        }
//
//
//    }
//}
//class MyCalculator{
//
//
//
//    public long computePower(int n,int p) throws Exception {
//        long result=1;
//        if (n<0 || p<0){
//
//            throw new Exception(" n or p should not be negative.");
//
//        } else if (n==0 && p==0) {
//            throw new Exception("\t"+"n and p should not be zero.");
//
//        }
//
//
//
//        return (long)Math.pow(n,p);
//
//
//    }
//
//
//}
//

    }}