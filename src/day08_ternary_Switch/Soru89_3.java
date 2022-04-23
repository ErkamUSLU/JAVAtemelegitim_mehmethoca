package day08_ternary_Switch;

import java.util.Scanner;

public class Soru89_3 {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı al ve sayının mutlak degerini yazdır.
        System.out.println("Bir sayı ver= ");
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();

        System.out.println(a<0 ? "|a|= "+(-1)*a : "|a|= "+a);

    }
}
