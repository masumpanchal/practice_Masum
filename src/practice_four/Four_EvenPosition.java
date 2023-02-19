package practice_four;

public class Four_EvenPosition {
    public static void main(String[] args){
        int b[] = {10, 55, 56, 88, 99, 78, 11, 56, 33, 67};
        System.out.println("Even Position............................");
        for (int i=1; i<b.length; i=i+2){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Odd Position............................");
        for (int i=0; i<b.length; i=i+2){
            System.out.print(b[i]+ " ");
        }
    }
}
