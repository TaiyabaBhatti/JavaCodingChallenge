package com.finalExam;

public class Q1_a {
    public static void main(String[] args) {
        int[] numerical = new int[10];
        String[] stringData = new String[10];
        numerical[0] = 11;
        numerical[1] = 12;
        numerical[2] = 13;
        numerical[3] = 14;
        numerical[4] = 15;
        numerical[5] = 16;
        numerical[6] = 17;
        numerical[7] = 18;
        numerical[8] = 19;
        numerical[9] = 20;


        stringData[0] = "1001";
        stringData[1] = "1002";
        stringData[2] = "1003";
        stringData[3] = "1004";
        stringData[4] = "1005";
        stringData[5] = "1006";
        stringData[6] = "1007";
        stringData[7] = "1008";
        stringData[8] = "1009";
        stringData[9] = "1010";

        int[][] set = new int[5][2];
        for (int i = 0; i < 5; i++) {

            set[i][0] = numerical[i*2];
            int num = Integer.parseInt(stringData[i*2]);
            set[i][1] = num;
        }

        for (int[] row : set) {
            for (int colum : row) {
                System.out.print(colum + "\t\t");
            }
            System.out.println();


        }
































































    }}



































