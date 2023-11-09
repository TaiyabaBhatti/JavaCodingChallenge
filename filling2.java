package com.finalExam;

import java.io.*;
import java.util.Scanner;

public class filling2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("D:\\2ND SEMESTER\\IdeaProjects\\Class Programs\\src\\com\\finalExam\\F4.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Write something to file as a line");
        String data = sc.nextLine();
        System.out.println("Write your number:");
        Long number = sc.nextLong();


        try {

            StringWriter stringWriter = new StringWriter();
            stringWriter.write(data + "\n");
            stringWriter.write(number.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            StringReader stringReader = new StringReader(data + "\n" + number);

            int i = stringReader.read();
            while (i != -1) {
                System.out.println((char)i );
                i=stringReader.read();
            }


        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }


        //***************** OutputStreamWriter and Reader ******************

//        try{
//            FileOutputStream fileOutputStream=new FileOutputStream(file.getPath());
//            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.write(data);
//            outputStreamWriter.write(number.toString());
//            outputStreamWriter.close();
//           }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//           }
//
//        try {
//            FileInputStream fileInputStream=new FileInputStream(file.getPath());
//            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
//            int i=inputStreamReader.read();
//            while (i!=-1){
//                System.out.println((char)i);
//                i=inputStreamReader.read();
//            }
//            inputStreamReader.close();
//            }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            }


        //FileWriter and FileReader

//        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter(file.getPath());
//            fileWriter.write(data+"\n");
//            fileWriter.write(number.toString());
//            fileWriter.close();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        FileReader fileReader;
//        try {
//            fileReader = new FileReader(file.getPath());
//            int i=fileReader.read();
//            while (i!=-1) {
//                System.out.print((char)i);
//                 i=fileReader.read();
//            }
//            fileReader.close();
//        }
//     catch (Exception e){
//     System.out.println(e.getMessage());
//     }


//    } catch (IOException e) {
//           throw new RuntimeException(e);
//       }
//    }
    }
}