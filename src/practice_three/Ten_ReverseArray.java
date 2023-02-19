package practice_three;

public class Ten_ReverseArray {
    public static void main(String[] args){
        int a[] = {25, 50, 90, 75, 64, 1};

        System.out.println("Original Array");
        for (int i: a) {
            System.out.print( + i + " ");
        }
        System.out.println();

        System.out.println("Reverse Array");
        for (int i=a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
