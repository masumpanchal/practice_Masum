package practice_six;

import java.util.Scanner;

//The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.
//15 is an evil number because in its binary equivalent, i.e., 1111, it has an even number of ones.
//16 is an odious number because in its binary equivalent, i.e., 10000 has not even number of ones
//23 is also an evil number because it has an even number of ones in its binary equivalent, i.e., 10111.
//To convert a decimal number into binary, we can use the toBinaryString() in-built method or do it manually by using the loop.
public class One_EvilNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (checkNumber(num)){
            System.out.println(num + " Is evil number......");
        }else System.out.println(num + " Is not evil number..........");
    }

    //Method to convert decimal into binary
    public static long convertToBinary(int number){
        long binaryNumber = 0;
        int rem = 0;

        while (number!=0){
            rem = number%2;
            binaryNumber = binaryNumber *10 + rem;
            number = number / 2;

        }
        return binaryNumber;
    }

    //Method to check Number is Evil or not
    public static boolean checkNumber(int number){
        long binaryNumber = convertToBinary(number);
        int count = 0;
        while (binaryNumber!=0){
            // if the last digit of binary number is 1, increase the count value
            if (binaryNumber %10 == 1){
                count++;
            }
            binaryNumber = binaryNumber/10;
        }
        // check whether the value of count is even or odd
        if (count % 2 == 0)
            return true;
        return false;
    }
}
