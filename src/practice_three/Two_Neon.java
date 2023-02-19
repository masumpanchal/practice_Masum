package practice_three;

//Program for Neon Number
//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
//Ex- num = 9; square = 81 is said to be neon if 8+1 = 9 and num == 9..................

public class Two_Neon {
    public static void main(String[] args){
    int num = 45;
    int sq = num * num;
    int temp=sq;
    int rem, sum=0;
    while (temp != 0){
        rem = temp %10;
        sum = sum + rem;
        temp = temp/10;
    }
    if (sum==num){
        System.out.println("Is neon number");
    }else System.out.println("Is not neon number");
    }
}
