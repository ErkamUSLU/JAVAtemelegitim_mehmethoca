package day08_ternary_Switch;

import java.util.Scanner;

public class Soru89_4 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın. Sayı pozitifse "Sayı pozitif" yazdırın, degilse sayının karesini yazdırın.
        System.out.println("Bir sayı ver=");
        Scanner scan= new Scanner(System.in);
        double number=scan.nextDouble();

        System.out.println((number<0)? (number*number):"Sayı pozitiftir.");
    }
}
