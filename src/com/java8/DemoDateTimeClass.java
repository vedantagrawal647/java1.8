package com.java8;

import javax.crypto.spec.PSource;
import java.time.*;

public class DemoDateTimeClass {
    public static void main(String[] args) {
        LocalTime t1= LocalTime.now();
        System.out.println(t1); // give local time

        LocalDate d1=LocalDate.now();
        System.out.println(d1); //give local  date

        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(dt1); //give local  date  time both


        Instant dt= Instant.now();
        System.out.println(dt); //also give data and time both
        //differnce between instance and localDateTime  is Instance end with Z in output but LocalDateTime output will not end with z

        //we can also get date time according to differnt zone
        LocalTime t2= LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println(t2); // give local time accoring to kuwait time zone


        LocalTime t3= LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t3); // give local time accoring to GMT





    }

}
