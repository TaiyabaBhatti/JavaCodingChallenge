package com.W3Resourse;
import java.util.Calendar;
import java.util.TimeZone;
public class DateAndTime {
    public static void main(String[] args) {

        //Write a Java program to print the current date and time in the specified format.
        // these all are the placeholders
//%tB: August (full month name)
//%te: 13 (day of the month)
//%tY: 2023 (year with century)
        //%y:   23
//%tl: 1 (hour in 12-hour format)
//%tM: 45 (minute)
//%tp: PM (AM/PM indicator)
// %S: seconds

        Calendar ref = Calendar.getInstance();

        System.out.format("%tB, %te and %tY%n",ref, ref, ref );
        System.out.format("%tl:%tM:%tS %tp%n",ref, ref, ref,ref );
        System.out.println(ref.getFirstDayOfWeek());



    }
}
