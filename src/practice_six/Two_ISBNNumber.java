package practice_six;
//ISBN is another special number in Java.
//ISBN stands for the International Standard Book Number that is carried by almost each every book.
//The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book.
//The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8
//+ 9*Digit9 + 10*Digit10 is divisible by 11. The digits are taken from right to left.
//So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
//Number2: 1259060977
//Sum = (1*10) + (2*9) + (5*8) + (9*7) + (0*6) + (6*5) + (0*4) + (9*3) + (7*2) + (7*1)
//Sum = 10 + 18 + 40 + 63 + 0 + 30 + 0 + 27 + 14 + 7
//Sum = 209
//Now, we divide the sum with 11 and check whether the remainder is 0 or not.
//rem = 209 % 11
//rem = 0
public class Two_ISBNNumber {
    public static void main(String[] args){
        if (checkNum(8147852369L)){
            System.out.println("Is ISBN number.................");
        }
        else System.out.println("Is not ISBN number..................");
    }
    static boolean checkNum(long Num){
        int sum = 0;
        int i, t, intNumber, dNumber;
        String strNumber;
        strNumber = "" + Num;
        if (strNumber.length() != 10){
            return false;
        }

        for(i=0; i<strNumber.length(); i++){
            intNumber = Integer.parseInt(strNumber.substring(i, i+1));
            dNumber = i+1;
            t = intNumber*dNumber;
            sum = sum + t;
        }

        if (sum % 11 == 0) {
            return true;
        }
        return false;
    }
}
