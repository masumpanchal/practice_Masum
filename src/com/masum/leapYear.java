package com.masum;
import java.time.Year;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        year = sc.nextInt();

        boolean isLeap = false;

        if ( year % 4 == 0) {
            if ( year % 100 == 0){
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if (isLeap = true)
            System.out.println("Is a leap year");
        else
            System.out.println("Is not a leap year");







    }
}
