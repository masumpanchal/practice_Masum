package practice_eleven;

public class Five_InsertionSort {
    public static void main(String[] args){
        int[] a = {9,14,3,2,43,11,58,22};
        int temp, j;
        for(int i=1; i<a.length; i++){
            temp = a[i];
            j=i;
            while (j>0 && a[j-1] > temp){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;
        }
        for(int i=0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
