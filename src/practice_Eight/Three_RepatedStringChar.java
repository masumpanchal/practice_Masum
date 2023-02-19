package practice_Eight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Three_RepatedStringChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.......");
        String str = sc.next();
        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //If map already contains characters the increase the value by 1.

        for (Character ch1: ch) {
                if (map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1) +1 );
                }else map.put(ch1, 1);
        }
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character,Integer> entry : entrySet) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }
        }
    }
}
