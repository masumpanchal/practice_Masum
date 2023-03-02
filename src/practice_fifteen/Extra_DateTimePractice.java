package practice_fifteen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Extra_DateTimePractice {
    public static void main(String[] args){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDateTime time = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2015,1,20, 6,15);
        System.out.println("New "+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


                int numFish = 4;
                String fishType = "tuna";
                //String anotherFish = numFish + 1;
                //System.out.println(anotherFish + " " + fishType);
                System.out.println(numFish + " " + 1);

    }

}
