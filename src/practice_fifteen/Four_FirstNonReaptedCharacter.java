package practice_fifteen;

import java.util.HashMap;
import java.util.Map;

public class Four_FirstNonReaptedCharacter {
    public static void main(String[] args){
        String str = "aagcdefccd";
        Map<Character, Integer> hMap = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();
        for (int i=0; i< ch.length; i++){
            if (hMap.containsKey(ch[i])== false){
                hMap.put(ch[i], 1);
            }else {
                hMap.put(ch[i], hMap.get(ch[i])+1);
            }
        }

        for (int i=0; i< ch.length; i++){
            int curFreq = hMap.get(ch[i]);
            if (curFreq ==1){
                System.out.println(ch[i]);
                break;
            }
        }
    }

}
