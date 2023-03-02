package practice_fifteen;

public class One_ArrayPairs {
    public static void main(String[] args){
        int[] arr ={2, 4, 3, 5, 7, 8, 9};
        int[] arr2 = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        printPair(arr, 7);
        System.out.println("Second array");
        printPair(arr2, 7);

    }
    public static void printPair(int[] arr, int sum){
        for (int i=0; i< arr.length; i++){
            int first = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                int second = arr[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n",first, second);
                }
            }
        }
    }
}
