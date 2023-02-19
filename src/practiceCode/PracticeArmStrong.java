package practiceCode;

public class PracticeArmStrong {
    public static void main(String[] args){
        int arm = 370;
        int temp=arm;
        int count = 0;
        while (temp !=0){
            temp = temp /10;
            count = count + 1;
        }
        System.out.println(count);
        temp = arm;
        int sum=0, pro=1, rem;
        while (temp !=0){
            pro = 1;
            rem = temp %10;
            for (int i =1; i<=count; i++){
                pro = pro * rem;
            }
            sum = sum + pro;
            temp = temp /10;
        }
        if ( sum == arm){
            System.out.println("Is ArmStrong.......");
        }
        else {
            System.out.println("Is not ArmStrong.........");
        }
    }
}
