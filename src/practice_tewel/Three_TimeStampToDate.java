package practice_tewel;

import java.sql.Timestamp;
import java.util.Date;

public class Three_TimeStampToDate {
    public static void main(String[] args){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);
        Date dt = new Date(ts.getTime());
        System.out.println(dt);
    }
}
