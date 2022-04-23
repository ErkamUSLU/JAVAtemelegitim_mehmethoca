package day06_ifElseStatements;

import java.util.Scanner;

public class Soru78_7 {
    public static void main(String[] args) {
        /*
        Soru-6)Kullanıcıdan 100 uzerinden notunu isteyin. Notu harf sistemine cevirip yazdırın. 50'den kucuk ise "D",
        50-60 arası "C",60-80 arası "B", 80 ve uzerinde ise "A" yazdırın.
         */
        System.out.print("Lutfen aldıgınız puanı sayısal olarak giriniz= ");
        Scanner scan = new Scanner(System.in);
        double not = scan.nextDouble();
        if (not <= 100 && not >= 80) {System.out.println("A");}
        else if (not < 80 && not >= 60) {System.out.println("B");}
        else if (not < 60 && not >= 50) {System.out.println("C");}
        else if (not < 50) {System.out.println("D");}
        else {System.out.println("Cok buyuk ya da cok kucuk bir sayı girdiniz,tekrar deneyin...");}

    }
}
