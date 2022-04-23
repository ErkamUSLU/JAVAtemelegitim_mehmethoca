package day07_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı isteyin sayıların ikisi de + ise sayıların toplamını yazdırın; sayıların ikisi de - ise
        sayıların carpımını yazdırın; sayılar farklı isaretli ise "farklı isaretli sayılarla islem yapamazsın" yazdırın;
        sayılardan 0'a esit olan varsa "sıfır carpmaya gore yutan elemandır" yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayı yazın: ");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        if(sayı1>0&&sayı2>0){System.out.println("Girdiginiz iki sayı da pozitif oldugundan toplamı= "+(sayı1+sayı2));}
        else if(sayı1<0&&sayı2<0){System.out.println("Girdiginiz iki sayı da negatif oldugundan carpımı="+(sayı1*sayı2));}
        else if(sayı1*sayı2<0){System.out.println("Farklı isaretli sayılarla islem yapamazsın");}
        else{System.out.println("0 carpmaya gore yutan elemandır");}
    }
}

