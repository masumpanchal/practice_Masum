package com.masum;

public class PrimePractice {
   public static void main(String[] args){
        int num = 7;
        for (int i=2; i<num; i++){
            if (num%i == 0){
                System.out.println("Is not prime");
                break;
            }
            else {
                System.out.println("Is prime number");
                break;
            }
        }
        // Printing 1 to 100 numbers prime number

       int temp;
       System.out.println("----------------------------------------------------------------------------------");
       System.out.println("Printing prime numbers between 1 to 100");
       for (int i=2; i<=100; i++){
           temp = 0;
           for (int j=2; j<i; j++){
               if (i%j==0){
                   temp = 1;
               }
           }
           if (temp == 0){
               System.out.print(i+ " ");
           }
       }
   }
}
