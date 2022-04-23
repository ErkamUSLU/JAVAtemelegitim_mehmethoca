package day08_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
       /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e bölünüyorsa son rakamını kontrol
        *edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı”
        *yazdırın. Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 basamaklı bir tam sayı girin= ");
        int num1= scan.nextInt();

        if (num1<1000 || num1>9999)//istenmeyen durumu yazıyoruz
         {System.out.println("Lutfen 4 basamaklı bir sayı giriniz.");}
        else if(num1%5==0)//4 basamaklı ve sayı 5'e bolunuyor
         {if (num1%10==0){System.out.println("5'e bolunen cıft sayı");}
          else {System.out.println("5'e bolunen tek sayı");};}
        else //4 basamaklı ve sayı 5'e bolunemiyor
        {System.out.println("Tekrar deneyin.");
        }
    }
}
