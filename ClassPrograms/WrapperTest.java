//package com.bitspedia.oop.lec16_arraylist;
import java.lang.Integer;
public class WrapperTest {

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        int n = 10;
        Integer num1 = new Integer(20);

        System.out.println(sum(new Integer(30), num1));

        int sum = n + num1;
        System.out.println(sum);

//        Integer num = new Integer(10);
//
//        String number = "100";
//        int num1 = Integer.parseInt(number);
//        System.out.println(num1);
//
//        System.out.println(num);
//        System.out.println(Integer.MAX_VALUE);


    }
}
