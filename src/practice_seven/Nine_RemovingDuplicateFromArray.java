package practice_seven;

import java.util.Arrays;

public class Nine_RemovingDuplicateFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 8, 8, 9};
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length-1];
        for (int k =0; k<temp.length; k++){
            System.out.print(temp[k]+" ");
        }    }

}
