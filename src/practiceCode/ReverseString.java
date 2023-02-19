package practiceCode;

public class ReverseString {
    public static void main(String[] args) {
        String str = "meet";
        String rev = "";
        int length = str.length()-1;
        for (int i = length; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
