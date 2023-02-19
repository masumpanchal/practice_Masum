package practice_Fourteen;

public class Two_demoRecurrsion {
    public static int last = -1;
    public static int first = -1;

    public static void main(String[] args){
        String str = "abaacdaefaah";
        findOcurrance(str, 0, 'a' );

    }

    public static void findOcurrance(String str, int ind, char element){
        if (ind == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(ind);
            if (current == element){
                if (first == -1){
                    first = ind;
                }
                else{
                    last = ind;
                }
            }
            findOcurrance(str, ind+1, element);
    }
}
