package practice_nine;

public class Eight_StringRotation {
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "deabc";
        if (str1.length() != str2.length()){
            System.out.println("Is not rotation of each other........");
        }
        String str3 = str1.concat(str1);
        if (str3.contains(str2)){
            System.out.println("Is rotation of eachOther...");
        }else System.out.println("Is not roration of eachOther....");

    }
}
