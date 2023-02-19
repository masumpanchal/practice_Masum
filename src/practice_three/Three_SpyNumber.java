package practice_three;
//Program for spy number\
//A positive integer is called a spy number if the sum and product of its digits are equal.
//In other words, a number whose sum and product of all digits are equal is called a spy number.

public class Three_SpyNumber {
    public static void main(String[] args){
        int number = 132;
        int sum = 0;
        int pro=1;
        int temp = number, rem;

        //For sum
        while (temp != 0){
            rem = temp%10;
            sum = sum + rem;
            pro = pro * rem;
            temp = temp/10;
        }


        if (pro == sum) System.out.println(number + " Is spy number");
        else System.out.println(number+" Is not spy number");
    }
}
