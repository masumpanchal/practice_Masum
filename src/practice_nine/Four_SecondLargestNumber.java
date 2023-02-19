package practice_nine;

public class Four_SecondLargestNumber {
   public static void main(String[] args) {
      int a[] = {77, 56, 98, 35, 64, 12, 55};
      //int length = a.length-1;
      System.out.println(findSecondLargestNumber(a, 7));
   }

   public static int findSecondLargestNumber(int num[], int n) {
      int temp;
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (num[i] > num[j]) {
               temp = num[i];
               num[i] = num[j];
               num[j] = temp;
            }
         }
      }
      return (num[n - 2]);
   }
}

