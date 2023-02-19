package practice_four;
//A number is called an emirp number if we get another prime number on reversing the number itself.
//In other words, an emirp number is a number that is prime forwards or backward.
//It is also known as twisted prime numbers.

import java.util.Scanner;

public class Two_EmirpNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number");
        int num = sc.nextInt();
        int temp = num;
        int rem, rev=0;
        //reverse a number
        while (temp !=0){
            rem = temp%10;
            rev = rev *10 + rem;
            temp = temp/10;
        }

        if (isPrime(num)==true){
            if (isPrime(rev) == true){
                System.out.print("Is emirp Number");
            }else System.out.println("Is not emirp number");
        }else System.out.println("Is not emirp number");
    }
    static boolean isPrime(int number){
        int temp = number;
        boolean flag = true;
        for (int i = 2; i<number; i++){
            if (number%i ==0 ){
                flag = false;
            }
        }
        return flag;
    }
}
