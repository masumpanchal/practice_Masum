package com.masum;

import java.util.Scanner;

public class product {

    public static void main(String[] args){

    int a;
    int b;
    int product;

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();

        System.out.println("Enter b");
        b = sc.nextInt();

        product = a*b;

        System.out.println("Product of a and b is; " + product);


    }

}
