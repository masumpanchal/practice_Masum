package practice_six;

import java.util.Arrays;

public class Five_AssendingOrderArray {
    public static void main(String[] args){
        int a[] = {5, 2, 8, 7, 1};
        int temp =0;
        System.out.println("Original array : ");
        System.out.println(Arrays.toString(a));
        System.out.println("Assending order");
        for (int i=0; i< a.length; i++){
            for (int j=i+1; j< a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i: a) {
            System.out.print(i+ " ");
        }
    }
}
