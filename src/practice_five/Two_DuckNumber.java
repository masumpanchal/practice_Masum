package practice_five;

import java.util.Scanner;

public class Two_DuckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean flag = false;
        while (num !=0){
            if (num%10==0){
                flag = true;
            }
            num = num/10;
        }
        if (flag==true){
            System.out.println("Is duck number.............");
        }else System.out.println("Is not duck number...........");
    }
}
