package com.finalExam;
import java.io.*;
import java.util.Scanner;

public class filling1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data;
        boolean status;
        boolean status1;
//        File file=new File("D:\\2ND SEMESTER\\IdeaProjects\\Class Programs\\src\\com\\finalExam\\F2.txt");
//         try {
//             if (!file.exists()) {
//                 file.createNewFile();
//             } else {
//                 System.out.println("File Exist..");
//             }
//         }
//         catch (Exception e1){
//             System.out.println("Exception: "+e1.getMessage());
//         }

         File file=new File("D:\\2ND SEMESTER\\IdeaProjects\\Class Programs\\src\\com\\finalExam\\F3.txt");
         try {
             if (!file.exists()) {
                 file.createNewFile();
             } else {
                 System.out.println("File Exist..");
             }
         }
         catch (Exception e1){
             System.out.println("Exception: "+e1.getMessage());
         }
        System.out.println("Enter info");
         data= sc.nextLine();
        System.out.println("Enter you are 20 or not(true/false)");
        status=sc.nextBoolean();
        System.out.println("Enter you are 50 or not(true/false)");
        status1=sc.nextBoolean();

FileOutputStream fileOutputStream;
ObjectOutputStream objectOutputStream;

try {
    fileOutputStream=new FileOutputStream(file.getPath());
    objectOutputStream=new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeBoolean(status);
    objectOutputStream.writeObject(data);
    objectOutputStream.writeBoolean(status1);
    objectOutputStream.close();
}
catch (IOException e){

    System.out.println(e.getMessage());

}


FileInputStream fileInputStream;
ObjectInputStream objectInputStream;

try {
    fileInputStream=new FileInputStream(file.getPath());
    objectInputStream=new ObjectInputStream(fileInputStream);
    System.out.println(objectInputStream.readBoolean());
    System.out.println(objectInputStream.readObject());
    System.out.println(objectInputStream.readBoolean());
    objectInputStream.close();
}
catch ( Exception e){

    System.out.println(e.getMessage());

}






























         //************ BufferedOutput and InputStreams ****************

//        FileOutputStream fileOutputStream;
//        BufferedOutputStream bufferedOutputStream;
//
//        try {
//            fileOutputStream = new FileOutputStream(file.getPath());
//            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
//            bufferedOutputStream.write(data.getBytes());
//            bufferedOutputStream.close();
//         }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        FileInputStream fileInputStream;
//        BufferedInputStream bufferedInputStream;
//        try {
//            fileInputStream = new FileInputStream(file.getPath());
//            bufferedInputStream=new BufferedInputStream(fileInputStream);
//            int i=bufferedInputStream.read();
//            while (i!=-1){
//                System.out.print((char)i);
//                i=bufferedInputStream.read();
//            }
//            bufferedInputStream.close();
//         }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }

         //****************** ByteArrayInput and Output Streams *************************

//        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
//        System.out.println("Write to an byte Array..........");
//        data= sc.nextLine();
//        try {
//            outputStream.write(data.getBytes());
//            byte[] bytearray=outputStream.toByteArray();
//            for (int i = 0; i < bytearray.length; i++) {
//                System.out.print((char) bytearray[i]);
//            }
//            outputStream.close();
//        }
//        catch (IOException e){
//        System.out.println("Exception: "+e.getMessage());
//       }
//
//
//      ByteArrayInputStream inputStream=new ByteArrayInputStream(data.getBytes());
//        try {
//       int bytenum=inputStream.read();
//       while (bytenum!=-1){
//           System.out.println((char)bytenum);
//       bytenum=inputStream.read();
//       }
//           inputStream.close();
//       }
//       catch (IOException e){
//
//           System.out.println(e.getMessage());
//       }

//        **************************** FileInputStreams and FileOutputStreams *****************************
//         try {
//             FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
//             System.out.println("Write your info...");
//             String data = sc.nextLine();
//           //  byte[] byteArray = data.getBytes();
//             fileOutputStream.write(data.getBytes());
//             fileOutputStream.close();
//         }
//         catch (Exception e2){
//             System.out.println("Exception: "+e2.getMessage());
//         }
//
//         try {
//             FileInputStream fileInputStream=new FileInputStream(file.getPath());
//
//             int readbyte=fileInputStream.read();
//while (readbyte!=-1){
//
//    System.out.println((char)readbyte);
//    readbyte=fileInputStream.read();
//}
//fileInputStream.close();
//         }
//         catch (Exception e3){
//             System.out.println("Exception: "+e3.getMessage());
//         }















    }

}
