package pratice_thirteen;

public class One_Frequency {
    public static void main(String[] args){
        String str = "picture perfect";
        int[] freq = new int[str.length()];
        int i,j;
        //Converts given string into character array
        char[] chars = str.toCharArray();
        for (i=0; i<chars.length; i++){
            freq[i] = 1;
            for(j=i+1; j< chars.length; j++){
                if (chars[i] == chars[j]){
                    freq[i] ++;
                    //Set string[j] to 0 to avoid printing visited character
                    chars[j]='0';
                }
            }
        }
        for (i=0; i<chars.length; i++){
            if (chars[i] !=' ' && chars[i] != '0'){
                System.out.println(chars[i]+" --- "+freq[i]);
            }
        }
    }
}
