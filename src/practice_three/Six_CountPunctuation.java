package practice_three;

public class Six_CountPunctuation {
    public static void main(String[] args){
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        int count = 0;

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i)==',' || str.charAt(i)=='.'|| str.charAt(i)=='\'' || str.charAt(i)=='\"' || str.charAt(i)=='?'){
                count++;
            }
        }
        System.out.println(count);
    }
}
