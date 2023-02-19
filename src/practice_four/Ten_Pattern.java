package practice_four;

public class Ten_Pattern {
    public static void main(String[] args){
        int line = 10; int i =1, j;

        for (i=1; i<=line; i++){
            for (j=1; j<=i; j++){
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}
