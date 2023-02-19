package practiceCode;

public class PracticeFactorial {
    public static void main(String[] args) {
        //fi1(5);
        System.out.println(fi1(10));
        int num = 10;
        int pro = 1;
        for (int i = 1; i <= num; i++) {
            pro = pro * i;
        }
        System.out.println(pro);
    }

    static int fi1(int number) {
        if (number == 0) {
            return 1;
        } else {
           return (number *fi1 (number-1));
        }
    }
}
