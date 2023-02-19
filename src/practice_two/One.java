package practice_two;

//Program for reverse a number
public class One {
    public static void main(String[] args){
        int num = 123654;
        int temp=num, rev=0, rem;
        while (temp !=0){
            rem = temp%10;
            rev = rev *10 + rem;
            temp = temp/10;
        }
        System.out.println(rev + " Is the reverse of " + num);

    }
}
