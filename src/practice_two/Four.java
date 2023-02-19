package practice_two;

import java.util.Scanner;

//Sunny number is the number that n+1 is the perfect square..... ex- n=80 n+1 = 81 is the square of 9......

public class Four {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int n = number+1;
        double sq_root = Math.sqrt(n);

        if (sq_root - Math.floor(sq_root)==0){
            System.out.println("Is Sunny Number");
        }
        else {
            System.out.println("Is not");
        }

    }
}
