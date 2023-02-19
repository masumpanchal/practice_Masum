package practice_Eight;

public class Two_PalindromeInteger {
    public static void main(String[] args){
       int number = 12321, sum=0,  p;
       p=palindrome(number, sum);
       if (number==p){
           System.out.println(number+ " is palindrome");
       }else System.out.println(number + " is not a palindrome");
    }
    static int palindrome(int number, int check){
        if (number == 0)
            return check;
        check = check*10 + number%10;
        return palindrome(number/10, check);
    }
}
