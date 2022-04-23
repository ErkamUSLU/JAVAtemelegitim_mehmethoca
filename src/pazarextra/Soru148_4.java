package pazarextra;

import java.util.Scanner;

public class Soru148_4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis harfinde biten tum
        // harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

        System.out.println("Lutfen bir metin girin= ");
        String metin = scan.nextLine();
        char bas = metin.toUpperCase().charAt(0);
        char son = metin.toUpperCase().charAt(metin.length() - 1);
        char karakter;
        if (bas <= son) {
            for (karakter = bas; karakter <= son; ++karakter)
                System.out.print(karakter + " ");
        } else {
            for (karakter = bas; karakter >= son; --karakter)
                System.out.print(karakter + " ");
        }
    }
}
