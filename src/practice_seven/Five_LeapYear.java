package practice_seven;

import java.util.Scanner;

public class Five_LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year %400 ==0 || year %100 !=0 && year%4 ==0){
            System.out.println("Is Leap year...........");
        }else System.out.println("Is not Leap year...........");
    }
}
