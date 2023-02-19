package practiceCode;

import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int temp = 0;
        for(int i=2; i<=num-1; i++){
            if (num % i ==0){
                temp= temp+1;
            }
        }
        if (temp == 0){
            System.out.println(num+" Is a Prime Number");
        }
        else{
            System.out.println(num+" Is Not a Prime NUmber");
        }

        //For printing 1 to 100 Prime number

        for (int i=1; i<=100; i++){
            int flag = 0;
            for (int j=2; j<=i-1; j++){
                if (i%j == 0){
                    flag=flag+1;
                }
            }
            if(flag == 0){
                System.out.print(i + " ");
            }
        }
    }
}
