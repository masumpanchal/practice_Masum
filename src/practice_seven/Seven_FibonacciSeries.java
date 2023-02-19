package practice_seven;

public class Seven_FibonacciSeries {
    public static void main(String[] args){
        int n = 15;
        int a =1, b=1, c;

        System.out.print(a+ " "+b);

        for (int i =1; i<=n; i++){
            c = a+b;
            System.out.print( " " +c+ " ");
            a=b;
            b=c;
        }
    }
}
