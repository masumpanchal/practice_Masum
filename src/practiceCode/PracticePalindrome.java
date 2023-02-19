package practiceCode;

public class PracticePalindrome {
    public static void main(String[] args){
        StringPalindromeCheck("aba");
        int num = 123;
        int rev=0, rem, temp = num;
        while (temp!=0){
            rem = temp%10;
            rev = rev *10 + rem;
            temp = temp/10;
        }
        if (rev==num){
            System.out.println(num +" Is palindrome");
        }else{
            System.out.println(num+ " Is not palindrome");
        }
    }

    static void StringPalindromeCheck(String str){
        String temp = "";
        int len = str.length()-1;
        for (int i =len; i>=0; i--){
            temp = temp + str.charAt(i);
        }
        if(temp.equals(str)){
            System.out.println(str+" Is palindrome string......");
        }else {
            System.out.println(str + " Is not palindrome string............. ");
        }
    }
}

