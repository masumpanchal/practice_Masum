package practice_two;

//Program of Tech
//A number is called a tech number if the given number has an even number of digits and the number can be
// divided exactly into two parts from the middle.
//After equally dividing the number, sum up the numbers and find the square of the sum.
// If we get the number itself as square, the given number is a tech number, else, not a tech number.
// For example, 3025 is a tech number.

public class Five {
    public static void main(String[] args) {
        int n = 131;
        int temp = n;

        int digit = 0;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        if (digit % 2 == 0) {
            temp=n;
            int rem = temp % 100;
            int sec = temp / 100;
            int sum = rem + sec;
            int square = sum * sum;
            if (square == n) {
                System.out.println("Is tech Number");
            } else {
                System.out.println("Is not tech number");
            }
        }else {
            System.out.println("Is not tech number" + " Inside last else");
        }
        System.out.println("Tech Number between 10,000 Numbers");
        printTenThousand();
    }

    static void printTenThousand(){

        for (int i=1; i<=10000; i++){
            int fi = i%100;
            int si = i/100;
            int sq = (fi+si) * (fi+si);
            if (sq == i){
                System.out.print(i+" ");
            }
        }
    }
}