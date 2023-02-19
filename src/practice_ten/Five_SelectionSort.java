package practice_ten;

public class Five_SelectionSort {
    public static void main(String[] args){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Original Array....");
        for (int i: arr1) {
            System.out.print(i+ " ");
        }
        selectionSort(arr1);
        System.out.println();
        System.out.println("After sorting....");
        for (int i: arr1) {
            System.out.print(i+ "---");
        }
    }
    public static void selectionSort(int[] arr){
        int min; int temp=0;
        for (int i=0; i< arr.length; i++){
            min = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

}
