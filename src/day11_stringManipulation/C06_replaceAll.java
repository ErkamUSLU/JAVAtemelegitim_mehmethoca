package day11_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        // Kullanicidan isim-soyisim bilgisini alıp butun harfleri * yapalim.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi yaziniz= ");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));
    }
}
