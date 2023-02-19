package pratice_thirteen;

import java.util.Scanner;

public class Five_SwapNumbersBitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a's value");
        int a = sc.nextInt();
        System.out.println("Enter b's value");
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;

        int x = 10;
        int y = 20;
        x = x*y;
        y = x/y;
        x = x/y;
        System.out.print(x + " " +y);
        System.out.println();
        System.out.println("After swap : a is "+ a+ " B is : " + b);
    }
}
