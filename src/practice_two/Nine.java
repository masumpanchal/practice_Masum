package practice_two;

//Java Program to count the total number of characters in a string
public class Nine {
    public static void main(String[] args){
        String sr = "The java world hello";
        int count = 0;
        for (int i=0; i<sr.length(); i++){
            if (sr.charAt(i) != ' '){
                ++count;
            }
        }
        System.out.println(count);
    }
}
