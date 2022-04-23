package day13_stringManipulation;

import java.util.Scanner;

public class Soru123_4 {
    public static void main(String[] args) {
        //Kullanıcıdan isim ve soyisim isteyip hangisinin daha uzun oldugunu yazdırın.
        Scanner scan = new Scanner(System.in);
        String ad=scan.next();
        String soyAd=scan.next();
        if(ad.length()>soyAd.length()){
            System.out.println("Ismin daha uzun");
        }else if(soyAd.length()>ad.length()){
            System.out.println("Soyısmın daha uzun");
        }else{
            System.out.println("Ikisi esit uzunlukta");
        }
    }
}
