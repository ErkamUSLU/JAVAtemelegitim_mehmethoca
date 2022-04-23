package day04matematikselIslemler;
import java.util.Scanner;
public class C17_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız dort basamaklı bir sayının
        //basamaklardaki rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 4 basamaklı bir sayı giriniz= ");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;


        //1.adım-) r=0, rt=0 sayi=7532

        rakam=sayi%10;//2
        rakamlarToplami +=rakam;//2
        sayi/=10;//753


        //2.adım-) r=2 rt=2 sayi=753

        rakam=sayi%10;//3
        rakamlarToplami +=rakam;//5
        sayi/=10;//75


        //3.adım r=3 rt=5 sayi=75

        rakam=sayi%10;
        rakamlarToplami +=rakam;//10
        sayi/=10;//7

        //4.adım r=4 rt=10 sayi=7


        rakam=sayi%10;
        rakamlarToplami+=rakam;//17
        sayi/=10;//0
        System.out.println("Girdiginiz sayının rakamlar toplamı= "+rakamlarToplami );







    }
}
