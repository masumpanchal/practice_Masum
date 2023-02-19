package practice_two;
//Program for Fascinating
//Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number
//will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

public class Six {
    public static void main(String[] args){
        int num = 327;
        int ch1 = num*2;
        int ch2 = num*3;
        String concatstr = num + "" + ch1 + ch2;
        boolean found = true;


        for(char c= '1'; c<='9'; c++){
            int count = 0;
            for (int i =0; i<concatstr.length(); i++){
                char ch = concatstr.charAt(i);
                if (ch == c){
                    count++;
                }
            }
            if (count>1 && count==0){
                found = false;
                break;
            }
        }
        if (found){
            System.out.println("Is Facsinating...... ");
        }else {
            System.out.println("Is not Fascination....");
        }
    }
}
