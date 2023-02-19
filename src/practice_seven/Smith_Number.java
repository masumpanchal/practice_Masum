package practice_seven;
//A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1.
//It is also known as a joke number. It is a sequence of OEIS A006753.
//Sum of digits = 8 + 5 = 13
//Prime factors of 85 is: 5,17
//Sum of digits of its prime factors = 5 + 1+ 7 = 13
//Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal.
//Hence, the given number (85) is a smith number.
//smith numbers are 4, 27, 85, 94, 121, 166, 202, 265, 274, 319, 346, 666, etc.
public class Smith_Number {
    public static void main(String[] args){
        int  n = 85;
        int check = sumOfDigit(n);
        int check2 = sumOfPrrimeFact(n);
        if (check==check2){
            System.out.println("Is smith number");
        } else System.out.println("Is not smith number");
    }
    static int sumOfPrrimeFact (int num){
        int i=2, sum=0;
        while (num>1){
            if (num%i==0){
                sum = sum + sumOfDigit(i); // i is the primeFactor of sum.....
                num = num/i;
            }
            else i++;
        }
        return sum;
    }

    static int sumOfDigit(int n){
        int s=0;
        while (n>0){
            s = s+ n%10;
            n = n/10;
        }
        return s;
    }
}
