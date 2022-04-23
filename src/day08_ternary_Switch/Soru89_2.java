package day08_ternary_Switch;

import java.util.Scanner;

public class Soru89_2 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı isteyin ve tek veya cift oldugunu yazdırın.

        System.out.println("Bir sayı ver= ");
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();

        System.out.println(a%2==0 ? "ciftir":"tektir");
    }
}
