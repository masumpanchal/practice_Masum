package practice_two;

// Program for Peterson number
// 145 = 1! + 4! + 5!
// 1 + 24 + 120 = 145
public class Three {
    public static void main(String[] args){
        int n = 145;
        int temp = n;
        int pro, sum=0, rem;
        while (temp >0){
            rem = temp%10;
            pro=1;
            for (int i = 1; i<=rem; i++){
                pro = pro * i;
            }
            sum = sum + pro;
            temp = temp/10;
        }
        if (sum == n){
            System.out.println(n + " Is Peterson number.....");
        }else {
            System.out.println(n + "Is not Peterson.......");
        }
    }
}
