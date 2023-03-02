package practice_Fourteen;

public class Missing_Number {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int length = arr.length;
        //System.out.println(length);
        int n = 15;
        int totalSum = n*((n+1)/2);
        int sum = countSum(arr, 0);
        System.out.println(totalSum - sum);
    }
    public static int countSum(int[] arr, int sum){
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
