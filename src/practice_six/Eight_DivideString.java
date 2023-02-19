package practice_six;

import java.util.Arrays;

public class Eight_DivideString {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int length = str.length();
        int n = 3;
        int chars = length/n;
        int temp = 0;
        String Equalstr[] = new String[n];
        if (length % n != 0){
            System.out.println("String is not divided into equals parts............");
        }else {
            for (int i=0; i<length; i = i+chars){
                String part = str.substring(i, i+chars);
                Equalstr[temp] = part;
                temp++;
            }
        }
        System.out.println(Arrays.toString(Equalstr));

    }
}
