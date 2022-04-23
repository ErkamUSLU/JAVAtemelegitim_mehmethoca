package day06_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftanınGünleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici mi haftasonu mu oldugunu yazdirin
        //        Ornek: gun=Pazar output = “Haftasonu”
        //               gun=Sali output = “Haftaici”
        //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> haftasonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun ismini yaziniz= ");
        String gunIsmi = scan.next().toUpperCase();//Hepsıi buyuk harf oldu.

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("Girdiginiz gun haftasonudur.");
        }
        else{
            System.out.println("Girdiginiz gun haftaicidir.");
        }

    }
}