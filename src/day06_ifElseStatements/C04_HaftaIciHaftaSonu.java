package day06_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici mi haftasonu mu oldugunu yazdirin
        //        Ornek: gun=Pazar output = “Haftasonu”
        //               gun=Sali output = “Haftaici”
        //*** String icin equals method’unu kullanin


        //pazar veya cumartesi ise ===> haftasonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici

/*
String case sensitive'dir.
Yani pazar,PAZAR,Pazar,PAzar bunlar hep farklı kelimelerdir
Bu durumda String methodlarından yardım alırız
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazınız= ");
        String gunIsmi= scan.next().toLowerCase();//kullanıcı nasıl yazarsa yazsın kod kucuk harfe cevirir


        //String ifadelerde == kullanılması tavsiye edilmez
        //cunku bekledigimizden farklı sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("Girdiginiz gun haftasonudur.");
        }

        if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
            gunIsmi.equals("persembe") ||  gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz gun haftaicidir.");
        }

    }
}
