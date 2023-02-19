package practice_three;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nine_SmallestAndLargest {
    public static void main(String[] args) {
        int[] a = {25, 11, 7, 75, 56};
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if (a[i]<min)
                min = a[i];
        }
        System.out.println(min);

        //Second senario
        Arrays.sort(a);
        System.out.println(a[0]);



    }
}
