package day06_ifElseStatements;
import java.util.Scanner;
public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //Soru-1) Kullanicidan bir tamsayi isteyin ve sayinin tek mi cift mi oldugunu yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz= ");
        int sayi= scan.nextInt();
        if (sayi%2 == 0){
            System.out.println("1-)Girilen sayi cift sayidir.");
        }
        if (sayi%2 != 0){
            System.out.println("1-)Girilen sayi tek sayidir.");
        }
        /*
        normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        if else ile tek statement'da yapmak daha guzel olur
        */
        //======== if else ile cozum=======

        if (sayi%2==0){
            System.out.println("2-)Girilen sayi cift sayidir.");
        }
        else {
            System.out.println("2-)Girilen sayi tek sayidir.");
        }

    }
}
