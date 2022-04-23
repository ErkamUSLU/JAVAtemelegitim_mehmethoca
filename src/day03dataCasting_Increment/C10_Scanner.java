package day03dataCasting_Increment;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        //soru 7-) kullanıcıdan ismini alıp isminin bas harfini yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        char ilkHarf=scan.next().charAt(0);
        //charAt (index methodu parametre olarak yazdıgımız indexteki charı bize getirir)
        //String'de index 0dan baslar
        //Ersin
        //01234
        System.out.println("Girdiginiz ismin ilk harfi:  "+ilkHarf);


    }
}
