package practice_three;

//Program to write Duplicate element
public class Five_DuplicateElement {
    public static void main(String[] args){
        int[] ar = {1, 2, 3, 2, 4, 3, 5, 6, 6};
        int count =0;
        for (int i=0; i<ar.length; i++){
            for (int j=i+1; j< ar.length; j++){
                if (ar[i] == ar[j]){
                    System.out.println(ar[j]);
                }
            }
        }
    }
}
