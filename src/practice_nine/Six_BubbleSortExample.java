package practice_nine;

import java.util.Arrays;

public class Six_BubbleSortExample {
    public static void main(String[] args){
        int arr[] = {3,60,35,2,45,320,5};
        System.out.println("Array befor sort : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Arrays afer sort : " + Arrays.toString(arr));
    }
    static void bubbleSort(int[] number){
        int n = number.length;
        int temp;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if (number[j] > number[j+1]){
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
}
