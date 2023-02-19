package practice_four;

public class Six_VowelConstant {
    public static void main(String[] args){
        String str = "This is a really simple sentence";
         str = str.toLowerCase().replace(" ", "");
        int vCount=0, cCount=0;
        for (int i=0; i<str.length(); i++){
               if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                   vCount++;
               }else cCount++;
        }
        System.out.println(vCount + " " +cCount);
    }
}
