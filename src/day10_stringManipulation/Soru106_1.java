package day10_stringManipulation;

import java.util.Scanner;

public class Soru106_1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir cumle ve harf isteyin; harfin cumlede var olup olmadıgını yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yazınız =" );
        String cumle=scan.nextLine();
        System.out.println("Lutfen cumleden bir harf seciniz =");
        String harf=scan.next();

        if (cumle.indexOf(harf)==(-1)){
            System.out.println("Secilen harf cumlede yok.");}
        else{
            System.out.println("Secilen harf cumlede var.");}
    }
}
