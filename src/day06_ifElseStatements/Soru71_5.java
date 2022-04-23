package day06_ifElseStatements;

import java.util.Scanner;

public class Soru71_5 {
    public static void main(String[] args) {
        /*
        Soru-5)Kullanıcıdan bir gun alın. Eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdırın
                                          Eger gun "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdırın
                                          Eger gun "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdırın
        */
        System.out.println("Lutfen ekrana haftanın bir gununu yazınız= ");
        Scanner scan=new Scanner(System.in);
        String gun=scan.next().toUpperCase();

        if (gun.equals("CUMA")){
            System.out.println("Muslumanlar icin kutsal gundur.");
        }
        else if (gun.equals("CUMARTESI")){
            System.out.println("Yahudiler icin kutsal gundur.");
        }
        else if (gun.equals("PAZAR")){
            System.out.println("Hristiyanlar icin kutsal gundur.");
        }
        else {
            System.out.println("Rastgele bir gundur.");
        }
    }
}
