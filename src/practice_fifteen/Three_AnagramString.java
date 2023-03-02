package practice_fifteen;

import java.util.Arrays;

public class Three_AnagramString {
    public static void main(String[] args){
        String str1 = "stop";
        String str2 = "tops";
        if (str1.length() != str2.length()){
            System.out.println("Is not anagrams string......");
        }
        char[] c = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(b);

        if (Arrays.equals(c,b)){
            System.out.println("Is anagram");
        }else System.out.println("Is not anagram");
    }
}
