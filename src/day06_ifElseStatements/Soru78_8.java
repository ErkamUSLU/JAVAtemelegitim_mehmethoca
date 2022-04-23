package day06_ifElseStatements;

import java.util.Scanner;

public class Soru78_8 {
    public static void main(String[] args) {
        /*
        Soru-8)Kullanıcıdan maas icin bir teklif isteyin ve assagıdaki degerlere gore cevap yazdırın.
        Teklif 80000'in uzerinde ise "Kabul ediyorum.",60000-80000 arasında ise "Konusabiliriz.",
        60000'ın altında ise "Maalesef kabul edemem." yazdırın.
        */
        System.out.println("Maas icin ön teklifiniz kactır?");
        Scanner scan= new Scanner(System.in);
        long maas= scan.nextLong();

        if(maas>=80000){System.out.println("Kabul ederim");}
        else if(maas<80000 && maas>=60000){System.out.println("Konusalım");}
        else{System.out.println("Maalesef kabul edemem");}
    }
}
