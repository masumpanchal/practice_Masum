package practice_five;

import java.util.Scanner;

//Buzz number is another special number in Java that ends with digit 7 or divisible by 7. 42, 107, 147, 134.....
public class One_BuzzNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if (num%10 == 7 || num % 7 ==0){
            System.out.println("Is buzz number...........");
        }   else System.out.println("Is not buzz number..........");
    }
}
