package day06_ifElseStatements;

import java.util.Scanner;

public class Soru75_2 {
    public static void main(String[] args) {
        /*
        Soru-2)Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadıgını yazdırın.
         */
        System.out.println("Lutfen rastgele bir tusa basınız: ");
        Scanner tus = new Scanner(System.in);
        char c = tus.nextLine().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Girdiginiz karakter buyuk harftir= " + c);
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Girdiginiz karakter kucuk harftir= " + c);
        } else if (c >= '0' && c <= '9') {
            System.out.println("Rakam girdiniz= " + c);
        } else {
            System.out.println("Ozel karakter girdiniz= " + c);
        }
    }}
