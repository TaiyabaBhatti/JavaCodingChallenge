package com.UserDefinedClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {







    }
}

class ShipMeasurement{
    private float v_height;
    private float width;
    private float base;
    private float radius;
    private double area;

    ShipMeasurement(ArrayList<String> list, int index){
       v_height=10;
       width=5;
       base=6;
       radius=3;

       if (list.get(index).equals("Circle")){

        area=Math.PI*radius*radius;

       }
       else if (list.get(index).equals("Trapezoid")){

        area=(width+base);

       }



    }










}





