package day06_ifElseStatements;

import java.util.Scanner;

public class C07_HaftanınGunleriIElseIf {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanici gun ismini yanlıs girerse "Yanlıs giris!" yazdırın
        //Ornek:  gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin


        //pazar veya cumartesi ise ===> haftasonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun ismini yaziniz= ");
        String gunIsmi= scan.next().toLowerCase();

        //Hatalı girisleri de yazdırmak icin olasılıkları uce cıkardım.
        //haftasonu - haftaici - yanlıs giris
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
            System.out.println("Gırdıgınız gun haftasonudur.");
        }

        else if ( gunIsmi.equals("pazartesi")||gunIsmi.equals("salı")||gunIsmi.equals("carsamba")
                  ||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")){
            System.out.println("Gırdıgınız gun haftaicidir.");
        }

        else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz!");
        }
        /*
        eger if else if ..... statement else ile bitiyorsa olasılıklardan sadece bir tanesi mutlaka calısır
         java ilk buldugu true'a ait sonucu yazdırır ve kalan sartlara bakmaz
        if else if .... cumleleri else ile bitmese de calısır
        ancak bu durumda sadece bir olasılık calısabilir veya hicbir islem calısmayabilir
        */

    }
}
