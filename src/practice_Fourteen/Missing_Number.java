package practice_Fourteen;

public class Missing_Number {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int length = arr.length;
        System.out.println(length);
        int sum = countSum(15, 0);
        System.out.println(sum);
    }
    public static int countSum(int n, int sum){
        for (int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
