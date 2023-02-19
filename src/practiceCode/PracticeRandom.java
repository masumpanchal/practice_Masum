package practiceCode;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//There are mainly four ways to generate random number
//Using the random() Method
//Using the Random Class
//Using the ThreadLocalRandom Class
//Using the ints() Method (in Java 8)
public class PracticeRandom {
    public static void main(String[] args){
        //Using Random method.....................................................................................
        System.out.println("Random number1 : "+ Math.random());
        System.out.println("Random number2 : "+ Math.random());
        System.out.println("Random number3 : "+ Math.random());


        int min = 200, max = 500;
        double a = Math.random()*(max-min+1)+min;
        System.out.println("Random number between 200 to 400 is "+ a);

        int b = (int) (Math.random()*(max-min+1)+min);
        System.out.println("Random number between 200 to 400 is " + b);

        //Using Random classs

        Random random = new Random();

        int c = random.nextInt();
        System.out.println(c);

        //Using ThreadLocal

        int d =ThreadLocalRandom.current().nextInt();
        System.out.println(d);

        // using ints method of java 8

        System.out.println("Using ints method");
        random.ints(2, 50, 90).forEach(System.out::println);

    }
}
