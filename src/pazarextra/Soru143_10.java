package pazarextra;

import java.util.Scanner;

public class Soru143_10 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı isteyin. Kullanıcının girdigi iki sayıyı toplayıp, sonucu yazdıran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayı giriniz...");

        for (int  i=0 ;i <2 ; i++) {

            System.out.println("sayı1= ");
            int sayı1=scan.nextInt();

            System.out.println("sayı2= ");
            int sayı2=scan.nextInt();
            int toplam=sayı1+sayı2;
            System.out.println(sayı1+" + "+sayı2+ "= "+toplam);
        }
    }
}
