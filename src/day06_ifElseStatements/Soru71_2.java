package day06_ifElseStatements;

import java.util.Scanner;

public class Soru71_2 {
    public static void main(String[] args) {
        /*
        Soru-2)Kullanıcıdan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdırın
               Ornek: ilkharf=P output="Pazar,Pazartesi veya Persembe"
                      ilkharf=S output="Sali"
               ***Buyuk-kucuk harf problem olmaması icin toUpperCase methodunu kullanın.
        */

        System.out.print("Lütfen P, S, C harflerinden birini seciniz= ");
        Scanner scan=new Scanner(System.in);
        String ılkHarf= scan.next().toUpperCase();

        if(ılkHarf.equals("P")){
            System.out.println("Haftanın P ile başlayan gunleri= PAZARTESİ, PERSEMBE ve PAZAR'dır.");
        }
        else if(ılkHarf.equals("S")){
            System.out.println("Haftanın S ile başlayan gunleri= SALI'dır.");
        }
        else{
            System.out.println("Haftanın P ile başlayan gunleri= CARSAMBA, CUMA ve CUMARTESI'dir.");
        }
    }
}
