package practice_three;

import java.util.ArrayList;
import java.util.Collections;

//  we add these digits (i.e. 7+4+2), and the resultant (13) that we get becomes the next term of the series.
// 7, 4, 2, 13 next (13+2+4)
// 7, 4, 2, 13, 19 (19+13+2)
//7, 4, 2, 13, 19,34 ()
//7, 4, 2, 13, 19, 34, 66
// 7, 4, 2, 13, 19, 34, 66, 119
// 7, 4, 2, 13, 19, 34, 66, 119, 219
// 7, 4, 2, 13, 19, 34, 66, 119, 219, 404
//7, 4, 2, 13, 19, 34, 66, 119, 219,404, 742
public class One_KeithNumber {
    public static void main(String[] args){

        if(isKeithOrNot(742))
            System.out.println("Is KeithNumber");
        else
            System.out.println("Is not");

    }

    static boolean isKeithOrNot(int  num){
        //List stores all the digits of the X
        ArrayList<Integer> terms = new ArrayList<Integer>();
        int temp = num, n=0;
        while (temp !=0){
            terms.add(temp%10);
            temp = temp/10;
            n++;
        }

        Collections.reverse(terms);
        int next_term =0, i=n;

        while (next_term < num){
            next_term=0;
            for (int j = 1; j<=n; j++){
                next_term = next_term + terms.get(i-j);
            }
            terms.add(next_term);
            i++;
        }
        return (next_term == num);
    }

}
