package practiceCode;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("Enter the number upto which Fibonacci Series to print");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 1, b=1, c;

        System.out.print(a+" "+b+" ");

        //Fibonacci Series using loop and Iteration

        for (int i=1; i<=number; i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
