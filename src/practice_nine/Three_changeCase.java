package practice_nine;

public class Three_changeCase {
    public static void main(String[] args){
        String str1="Great Power";
        StringBuffer newSb = new StringBuffer(str1);
        for (int i=0; i<str1.length(); i++){
            if (Character.isLowerCase(str1.charAt(i))){
                //Convert it to upper case using toUperCase() function
                newSb.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            //Checks for upper case character
            else if(Character.isUpperCase(str1.charAt(i))){
                newSb.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("New String after conversion : " + newSb);
    }
}
