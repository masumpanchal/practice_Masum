package practiceCode;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n1 = 153;
        int temp = n1;
        int length = 0, digit, pro, sum=0;
        //Length
        while (temp!=0){
            length = length +1;
            temp = temp/10;
        }
        temp=n1;
        while (temp != 0){
            digit = temp % 10;
            pro=1;
            for (int i=1; i <= length; i++){
                pro = pro * digit;
            }
            sum = sum+ pro;
            temp = temp/10;
        }
        if (n1 == sum){
            System.out.println("ArmStrong");
        }
        else {
            System.out.println("Not ARMSTRONG");
        }
    }
}