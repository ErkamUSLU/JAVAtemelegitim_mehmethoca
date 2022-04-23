package day10_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        // Kullaniciya derse katili katilmak istemedigini sorun. Evet derse, cevabini ve "derse katiliminiz
        // onaylanmistir." yazdırın; hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yazınız.");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katilimizniz onaylanmıstır." );}
        else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz." );}
        else {
            System.out.println("Lutfen evet veya hayir yazınız.");}
    }
}
