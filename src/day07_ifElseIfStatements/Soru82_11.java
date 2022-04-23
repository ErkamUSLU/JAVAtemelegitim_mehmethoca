package day07_ifElseIfStatements;

import java.util.Scanner;

public class Soru82_11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdanbir sifre girmesini isteyin.
        Eger ilk harf buyuk ise 'A' olup olmadıgını kontrol edin. Ilk harf 'A' ise "Gecerli Sifre" degilse
        "Gecersiz sifre" yazdırın.
        Eger ilk harf kucuk harf ise "z" olup olmadıgını kontrol edin. Ilk harf 'z' ise "Gecersiz sifre" yazdırın.
         */

        System.out.println("Lutfen bir sifre giriniz= ");
        Scanner scan= new Scanner (System.in);
        String sifre= scan.next();

        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            if (sifre.charAt(0)=='A'){System.out.println("Gecerli sifre");}
            else{System.out.println("Gecersiz sifre");}
        }
        else if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            if (sifre.charAt(0)=='z'){System.out.println("Gecersiz sifre");}
            else{System.out.println("Gecerli sifre");}
        }
        else{System.out.println("Tekrar deneyin");
        }



    }
}
