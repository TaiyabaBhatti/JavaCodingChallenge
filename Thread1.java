package com.finalExam;

import java.util.Arrays;

public class Thread1 {
    public static void main(String[] args) {

            int[] array=new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i]=2*i;
        }
        System.out.println(Arrays.toString(array));

        MyThread1 reverse=new MyThread1(array);
        MyThread2 average=new MyThread2(array);
        reverse.setPriority(Thread.MAX_PRIORITY);
         reverse.start();
         average.start();






    }
}

class MyThread1 extends Thread{

    private int[] array;

    MyThread1(int[] array){

        this.array=array;
    }

 public void run(){

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int element:array) {
            System.out.println(element);
        }
    }


}
class MyThread2 extends Thread{

    private int[] array;
    MyThread2(int[] array){

        this.array=array;


    }



 public void run(){
         long average=0;
         int count=0;
        for (int i = 0; i <array.length ; i++) {

            if (i%2!=0){
                average+=array[i];
                count++;
            }
        }
        float result= (float) average /count;
        System.out.println(result);








    }

}
