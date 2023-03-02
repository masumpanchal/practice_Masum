package practice_fifteen;

import java.util.HashMap;
import java.util.Map;

public class Two_RepetedCharacter {
    public static void main(String[] args){
        String str = "abs aaa kss";
        Map<Character, Integer> dupCharMap = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (char keys : charArr){
            if (Character.isAlphabetic(keys)){
                if (dupCharMap.containsKey(keys)){
                    dupCharMap.put(keys, dupCharMap.get(keys)+1);
                }else {
                    dupCharMap.put(keys, 1);
                }
            }
        }
        dupCharMap.entrySet().removeIf(i -> i.getValue()==1);
        System.out.println(dupCharMap);
    }
}
