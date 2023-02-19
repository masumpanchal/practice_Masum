import java.util.Scanner;
public class SumUsingScanner {

    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number1");
        number1 = sc.nextInt();

        System.out.println("Enter Number2");
        number2 = sc.nextInt();

        sum = number1+number2;

        System.out.println("sum " + sum);

    }
}
