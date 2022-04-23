package pazarextra;

import java.util.Scanner;

public class Soru150_1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir rakam alın ve bu rakam icin carpım tablosunu ekrana yazdırın. Kullanıcının hata yapmadıgını
        //farz edin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı= ");
        int sayı=scan.nextInt();
        int a=1;

        while (a<=10){
            System.out.print(sayı+"*"+a+"= "+(sayı*a)+" ");
            a+=1;



    }
}}
