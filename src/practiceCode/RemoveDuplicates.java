package practiceCode;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){

    //------------------------------------- For sorted array------------------------------------

        int[] a = {1, 2, 3, 4, 4, 5, 5, 6, 7};
        int[] temp = new int[a.length];
        int j = 0;
        for (int i=0; i<a.length-1; i++){
            if (a[i] != a[i+1]){
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length-1];
        for (int k =0; k<temp.length; k++){
            System.out.print(temp[k]+" ");
        }

        //---------------------------------- For Unsorted Array-----------------------------------
        System.out.println();
        HashSet <Integer> hs = new HashSet<>();
        for (int i=0; i< a.length; i++){
            hs.add(a[i]);
        }
        for (int no: hs) {
            System.out.print(no + " ");
        }

    }
}
