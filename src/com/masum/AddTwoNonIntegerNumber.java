package com.masum;
import java.util.Scanner;

public class AddTwoNonIntegerNumber {

    public static void main(String[] args){

        double num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        num1 = sc.nextDouble();

        System.out.println("Enter num2");
        num2 = sc.nextDouble();

        sum= num1+num2;
        System.out.println("sum " + sum);

    }

}
