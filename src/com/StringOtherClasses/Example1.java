package com.StringOtherClasses;
import java.util.StringJoiner;
public class Example1 {
    public static void main(String[] args) {
        //String joiner

        StringJoiner joiner=new StringJoiner(", ");

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Mango");

        System.out.println(joiner);








    }



}
