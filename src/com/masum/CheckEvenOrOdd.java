package com.masum;
import java.util.*;

public class CheckEvenOrOdd {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer Number");
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

         if (num % 2 == 0) {
             System.out.println(" Is an Even Number");
         }
         else{
             System.out.println(" Is an Odd Number");
         }

    }

}
