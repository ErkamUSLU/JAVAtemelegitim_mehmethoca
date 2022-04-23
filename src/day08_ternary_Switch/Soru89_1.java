package day08_ternary_Switch;

import java.util.Scanner;

public class Soru89_1 {
    public static void main(String[] args) {
        System.out.println("iki sayı yazın");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.print("1.sayı= "+num1);

        int num2=scan.nextInt();
        System.out.println("2.sayı= "+num2);

        System.out.println((num1<num2) ? num1 : num2);


    }
}
