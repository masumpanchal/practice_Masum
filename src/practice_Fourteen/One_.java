package practice_Fourteen;

public class One_ {
    public static void main(String[] args){
        printSum(1, 5, 0);
        int n = 7;
        String str = "abcdefgh";
        System.out.println("Reverse string : ");
        reverseString(str, str.length()-1);

         int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
       fibonacci(n-2, a,b);
    }
    public static void printSum(int i, int n, int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int facto = fact(n-1);
        int fact_n = n * facto;
        return fact_n;

    }
    public static void fibonacci( int n, int a, int b){
        if( n== 0){
            return;
        }
       int c = a+b;
        System.out.println(c);
       fibonacci(n-1,b,c);
    }
    public static void reverseString(String str, int index){
        if (index == 0){
            //System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index)+ " ");
        reverseString(str, index-1);
    }
}
