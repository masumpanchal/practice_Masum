package practice_six;


import java.util.Arrays;

//Two Strings are called the anagram if they contain the same characters.
//However, the order or sequence of the characters can be different.
public class Seven_AnagramString {
    public static void main(String[] args){
        String str1 = "Brang";
        String str2 = "Graab";

        //Converting to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()){
            System.out.println("IS not anagrams");
        }else {
            //Converting both the arrays to character array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //sorting array
            Arrays.sort(string1);
            Arrays.sort(string2);

            //Comparing
            if (Arrays.equals(string1, string2)){
                System.out.println("Both the strings are anagram............");
            }else System.out.println("Both the strings are not anagram.........");
        }
    }
}
