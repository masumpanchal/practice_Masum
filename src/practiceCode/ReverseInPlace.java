package practiceCode;

import java.util.Arrays;
import java.util.Collections;

public class ReverseInPlace {
    public static void main(String[] args) {

        String[] name = {"meet", "abhi", "vatsal"};

        for (int i = name.length-1; i >= 0; i--) {
            System.out.print(name[i]+" ");
        }
        //-----------------------------------------Second Approach------------------------------------
        System.out.println();
        for (int i=0; i< name.length/2; i++){
            String temp = name[i];
            name[i] = name[name.length-1-i];
            name[name.length-1-i]=temp;
        }
        for (int j=0; j< name.length; j++){
            System.out.println(name[j]);
        }
        //-------------------------------------------third approach---------------------------------
        System.out.println();
        //Function to reverse array
        String[] myArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        System.out.println("Original String : "+ Arrays.asList(myArray));
        Collections.reverse(Arrays.asList(myArray));
        System.out.println(Arrays.asList(myArray));


    }
}
