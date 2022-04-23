package day31_dataTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println(tarihsaat);//2022-03-31T22:35:28.614843900
        //aradaki t tarih ve saat karisikligini engellemek icin

        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(10).plusMinutes(5));

    }
}
