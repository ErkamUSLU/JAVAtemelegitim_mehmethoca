package day06_ifElseStatements;

import java.util.Scanner;

public class Soru71_4 {
    public static void main(String[] args) {
        /*
        Soru-4)Kullanıcıdan dikdortgenin kenar uzunluklarını isteyin ve dikdortgenin kare olup olmadıgını yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdortgeninizin karsılıklı olmayan iki kenaruzunlugunu giriniz.");
        System.out.println("KENAR1= ");
        double kenar1 = scan.nextDouble();
        System.out.println("KENAR2= ");
        double kenar2 = scan.nextDouble();
        if (kenar1 == kenar2) {
            System.out.println("Sekliniz karedir.");
        } else {
            System.out.println("Sekliniz kare degildir.");
        }
    }
}
