package practice_ten;

public class Six_StringPalindrome {
    public static void main(String[] args){
        String str = "Kayak";
        str = str.toLowerCase();
        String newRev = "";
        for (int i=str.length()-1; i>=0; i--){
             newRev += str.charAt(i);
        }
        System.out.println(newRev);
        if (str.equals(newRev)){
            System.out.println("Is palindrome");
        }else System.out.println("Is not palindrome......");
    }
}
