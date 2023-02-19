package practiceCode;

public class LeapYear {
    public static void main(String[] args){
        int year = 2000;
        if(year%400 == 0 || year%4 ==0 && year%100 !=0){
            System.out.println("Is a Leap Year");
        }else {
            System.out.println("Is not Leap Year");
        }
    }
}
