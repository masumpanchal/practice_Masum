package practice_six;
//Krishnamurthy number is another special number in Java.
//A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number.
//Krishnamurthy number is also referred to as a Strong number.

public class Three_KrishnaMurtyNumber {
    public static void main(String[] args){
        int num = 145;
        int temp = num, rem, fact=1, sum=0;

        while (temp != 0){
            rem = temp%10;
            fact = 1;
            for (int i = 1; i<=rem; i++){
                fact =  fact * i;
            }
            sum = sum + fact;
            temp = temp/10;
        }
        System.out.println(num==sum ? "Is a KrishnaMurty Number..." : "Is not KrishnaMurtyNumber............");
    }
}
