package day13_stringManipulation;

import java.util.Scanner;

public class Soru123_1 {
    public static void main(String[] args) {


    /*Kullanıcıdan isim isteyin. Eger -isim 'a' iceriyorsa "Girdiginiz isim a iceriyor."
                                      -isim 'Z' iceriyorsa "Girdiginiz isim Z iceriyor."
                                      -ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdırın.
     */


        System.out.println("Isminiz= ");
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();

        if (ad.contains("a")) {
            System.out.println("Girdiginiz isim a iceriyor.");
        }
        if (ad.contains("Z")) {
            System.out.println("Girdiginiz isim Z iceriyor.");
        }
        if (!ad.contains("a") && !ad.contains("Z"))
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
    } }


