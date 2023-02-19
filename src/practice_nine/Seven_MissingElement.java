package practice_nine;

public class Seven_MissingElement {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = arr.length+1;
        int n1 = arr.length;
        int sumOfAll = (n*(n+1))/2;
        int sumOfArray = 0;
        for (int i=0; i<n1; i++){
            sumOfArray = sumOfArray + arr[i];
        }
        int remaining = sumOfAll - sumOfArray;
        System.out.println("Missing element is : " + remaining);
    }
}
