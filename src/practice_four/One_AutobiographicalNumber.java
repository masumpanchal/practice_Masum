package practice_four;
//A digit count numerically précises the frequency of digits 0 through 9 in the order in which they occur in a number.
//the two is that in autobiographical numbers digits are described in increasing order
//while self-describing primes digits can be described in any order.
//Some autobiographical numbers are: 1210, 2020, 21200, 3211000, 42101000, 521001000, 6210001000.
public class One_AutobiographicalNumber {
    public static void main(String[] args){
        int no = 1210;
        no= Math.abs(no);
        int temp = no;
        String str = String.valueOf(temp);
         // create an array to store the element

        int[] digitArray = new int[str.length()];
        for (int i = digitArray.length-1; i>=0; i--){
            digitArray[i] = temp%10;
            temp = temp/10;
        }
        boolean flag = true;
        for (int i=0; i<digitArray.length; i++){
            int count=0;
            for (int j=0; j< digitArray.length; j++){
                if (i == digitArray[j]){
                    count++;
                }
            }
            if (count != digitArray[i]){
                flag = false;
                break;
            }
        }

        if (flag) System.out.println(no + " Is autobiography number");
        else System.out.println(no + " Is not autobiography number");
    }
}
