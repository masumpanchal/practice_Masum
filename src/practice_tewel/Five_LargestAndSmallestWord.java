package practice_tewel;

import java.util.Arrays;

public class Five_LargestAndSmallestWord {
    public static void main(String[] args){
        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        String[] words = str.split(" ");
        String temp;
        for (int i=0; i<words.length; i++){
            for (int j=i+1; j<words.length; j++){
                if (words[i].length() > words[j].length()){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Largest word of the sentence is : " + words[words.length-1]);
        System.out.println("Smallest word of the sentence is : "+ words[0]);
    }
}
