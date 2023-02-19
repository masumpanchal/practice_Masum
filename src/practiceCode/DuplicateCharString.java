package practiceCode;

public class DuplicateCharString {
    public static void main(String[] args) {
        String str = "automation";
        int count = 0;
        char[] ch = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            boolean repated = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    repated = true;
                    System.out.println("Duplicate character are : " + ch[j]);
                    count++;
                }
            }
            if(!repated){
                sb3.append(ch[i]);
            }
        }
        System.out.println(sb3);
        System.out.println("Duplicate characters count : " +count);
//--------------------------------------------------------------------------------------------------------------------------------
        //Approch-1
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);
//---------------------------------------------------------------------------------------------------------------------------------
        //Approch 2
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char chc = str.charAt(i);
            int idx =  str.indexOf(chc, i+1);
            if (idx==-1){
                sb2.append(chc);
            }
        }
        System.out.println(sb2);
    }
}
