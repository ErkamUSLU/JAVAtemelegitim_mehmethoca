package day06_ifElseStatements;
import java.util.Scanner;
public class Soru78_6 {
    public static void main(String[] args) {
        /*
        Soru-6)Kullanıcıdan iki sayı isteyin.Sayıların ikisi de pozitif ise sayıların toplamını yazdırın;
        sayıların ikisi de negatif ise sayıların carpımını yazdırın; sayıların ikisi faklı isaretlerde ise
        "farklı isaretlerde sayılarla islem yapamazsın"yazdırın; sayılardan 0'a esit olan varsa "sıfır carpmaya
        gore yutan elemandır" yazdırın.
         */
        System.out.println("Lütfen iki tam sayı giriniz.");
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayı= ");
        int num1= scan.nextInt();
        System.out.println("2.sayı= ");
        int num2= scan.nextInt();
        if(num1>0 && num2>0){System.out.println(num1+num2);}
        else if(num1<0 && num2<0){System.out.println(num1*num2);}
        else if(num1==0 || num2==0){System.out.println("0 carpmaya göre yutan elemandır.");}
        else{System.out.println("Farklı isaretlerle islem yapamazsın.");}
    }
}
