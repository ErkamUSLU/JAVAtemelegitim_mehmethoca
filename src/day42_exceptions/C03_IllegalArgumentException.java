package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*Kullanicidan yasini isteyin. Kullanici yas olarak negatif bir sayi
        veya 120den buyuk bir sayi girerse Illegal Argument Exception olusacak sekilde bir program yazin*/


        Scanner scan=new Scanner(System.in);

         int yas =scan.nextInt();
         if (yas<0 || yas>120){
             //System.out.println("Lutfen yasinizi girin:");

             //Java bizim istedigimiz durumlarda exception firlatabilir
             throw  new IllegalArgumentException();
         }else System.out.println("Uygun bir yas girdiniz");
    }
}
