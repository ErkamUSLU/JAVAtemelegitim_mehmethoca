package day31_dataTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate  bugun= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1994,07,21);
        System.out.println(Period.between(dogumGunu,bugun));//P27Y8M10D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//27
        // FIXME: 31.03.2022
        // FIXME: 1.04.2022 
    }
}
