package practice_two;

import java.util.Scanner;

//Program to check the Automorphic number
public class Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        int square = num * num;

        while (num > 0){
            if (num == square%10){
                System.out.println("Is automorphic");
                break;
            }
            if (num%10 != square%10) {
                System.out.println("Is not Automorphic");
                break;
            }else {
            num = num/10;
            square = square/10;
            if (num%10 == square%10) {
                System.out.println("Is Automorphic ");
            }
            }
        }
        isAutomorphic(5);
    }

    //Second method
    static void isAutomorphic(int no){
        int sq = no * no;
        int count=0;
        int temp=no;
        while (temp !=0){
            temp = temp/10;
            count++;
        }
        System.out.println(count);
        int z = (int) ( sq%(Math.pow(10, count)));
        if (no == z){
            System.out.println("Is automorphic");
        }else {
            System.out.println("Is not");
        }
    }
}
