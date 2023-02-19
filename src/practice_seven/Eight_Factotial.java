package practice_seven;

public class Eight_Factotial {
    public static void main(String[] args){
        int num = 10; int fact= 1;
        System.out.println(Factorial(10)+" Inside Method");
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    static int flag = 1;
    static int Factorial(int num){
        if (num>0){
            flag = flag * num;
            Factorial(num-1);
        }
        return flag;
    }
}

