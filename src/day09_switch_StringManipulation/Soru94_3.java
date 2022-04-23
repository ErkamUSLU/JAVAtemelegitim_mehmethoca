package day09_switch_StringManipulation;

import java.util.Scanner;

public class Soru94_3 {
    public static void main(String[] args) {
        /*Kullabıcıdan bir sayı girmesini isteyin=
          Girilen sayı
          10 ise "iki basamaklı en kucuk sayı"
          100 ise "uc basamaklı en kucuk sayı "
          1000 ise "dort basanaklı en kucuk sayı"
          diger tum durumlarda "Girdigin sayıyı degistir." yazdırın.
         */

        System.out.print("Lutfen bir sayı girin= ");
        Scanner scan= new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println("Girilen Sayı==> "+number);
        switch(number){
            case 10:
                System.out.println("iki basamaklı en kucuk sayı");
                break;
            case 100:
                System.out.println("uc basamaklı en kucuk sayı");
                break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayı");
                break;
            default:
                System.out.println("Girdigin sayıyı degistir.");
        }
    }
}
