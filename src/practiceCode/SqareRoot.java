package practiceCode;

import java.util.Scanner;

public class SqareRoot {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        double squareRoot = sc.nextDouble();

        double num = Math.sqrt(squareRoot);
        System.out.println(num);
        System.out.println(root(144));
    }

    public static double root(int no){
        double temp;
        double z = no/2;
        do {
            temp=z;
            z=(temp+no/temp)/2;
        }while (temp-z!=0);
        return z;
    }
}
