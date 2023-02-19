package practice_five;

public class Four_SumOfArray {
    public static void main(String[] args){
        int[] a = {45, 568, 55, 1, 2, 3, 75, 99, 60};
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of total elements of array is : " + sum);
    }
}
