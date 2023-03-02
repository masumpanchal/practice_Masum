package practice_Fourteen;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        int[] newarr = new int[arr.length-1];
        int k=0;
        for (int i=0; i< arr.length-1; i++){
                if (arr[i] != arr[i+1]){
                    newarr[k++] = arr[i];
                }
            }
        newarr[k++] = arr[arr.length-1];
        // Changing original array
        for (int i=0; i<k; i++) {
            arr[i] = newarr[i];
        }
        for (int i : newarr) {
            System.out.println(i);
        }
    }
}
