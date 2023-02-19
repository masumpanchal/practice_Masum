package practiceCode;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        int no = 4;
        int fact=1;
        //For loop
        for (int i =1; i<= no; i++){
            fact = fact * i;
        }
        System.out.println(fact);

        int temp = 1;
        int num = 5;
        //While loop
        while (num != 1){
            temp = temp * num;
            num --;
        }
        System.out.println(temp);
        FactorialNumber f1 = new FactorialNumber();
        int result;
        result = f1.recursionFact(no);
        System.out.println(result);

    }
    //recursion method
    static int flag = 1;
      int recursionFact(int number) {
          if (number > 1) {

              flag = flag * number;
              recursionFact(number-1);
          }
          return flag;
      }
    }
