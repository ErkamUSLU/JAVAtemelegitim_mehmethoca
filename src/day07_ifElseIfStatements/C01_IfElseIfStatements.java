package day07_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        //Girilen bir karakterin harf olup olmadıgını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz= ");
        char karakter= scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter>='z'))
           {System.out.println("Girdiginiz karakter bir harftir.");}

        else {System.out.println("Girdiginiz karakter harf degildir.");}

    }
}
