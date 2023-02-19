package practiceCode;

import javax.swing.*;

public class PalindromeString {
    public static void main(String[] args){
        String str = "aba", rev ="";

        for (int i=str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(str+" Is a palindrome string");
        }else {
            System.out.println(str+" is not a palindrome string");
        }
    }
}
