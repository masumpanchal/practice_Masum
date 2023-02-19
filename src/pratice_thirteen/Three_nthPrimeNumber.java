package pratice_thirteen;

import java.util.Scanner;

public class Three_nthPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
        int n = sc.nextInt();
        int num=1, count=0, i;
        while (count < n){
            num = num +1;
            for (i=2; i<=num; i++){
                //determines the modulo and compare it with 0
                if (num%i==0){
                    //breaks the loop if the above condition returns true
                    break;
                }
            }
            if (i == num){
                //increments the count variable by 1 if the number is prime
                count = count+1;
            }
        }
        System.out.println("The " +n +"th prime number is: " + num);
    }
}
