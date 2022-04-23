package day06_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class Soru78_5 {
    public static void main(String[] args) {
        /*
        Soru-5)Kullanıcıdan gun ismini yazmasını isteyin. Girilen isim gecerli bir gun ise gun isminin 1,2 ve 3
        harflerini ilk harf buyuk diger harfler kucuk olarak yazdırın; gun ismi gecerli degilse
        "Gecerli gun ismi giriniz" yazdırın.
         */

        System.out.println("Lutfen bir gun ismi yazınız= ");


        Scanner scan=new Scanner(System.in);
        String gun=scan.next().toUpperCase();

        if (gun.equals("PAZARTESI")||gun.equals("SALI")||gun.equals("CARSAMBA")||gun.equals("PERSEMBE")
            ||gun.equals("CUMA")||gun.equals("CUMARTESI")||gun.equals("PAZAR")){
            System.out.print(gun.charAt(0)+" ");
            System.out.print(gun.toLowerCase().charAt(1)+" ");
            System.out.println(gun.toLowerCase().charAt(2)+" ");        }
        else{System.out.println("Gecerli bir gun ismi giriniz.");}



/*ikinci yol
        if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") || gun.equals("PERSEMBE")
            || gun.equals("CUMA") || gun.equals("CUMARTESI") || gun.equals("PAZAR"))
        {System.out.println(gun.charAt(0) + " " + gun.toLowerCase().charAt(1) + " " + gun.toLowerCase().charAt(2));}
        else {System.out.println("Gecerli bir gun ismi giriniz.");}

 */
    }}

