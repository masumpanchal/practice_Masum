package practice_three;

public class Seven_ConvertIntToString {
    public static void main(String[]args){
        int i = 500;
        String s= String.valueOf(i);
        String s1 = Integer.toString(i);
        String s2 = String.format("%d", i);

        System.out.println(s + s1 + s2);
    }
}
