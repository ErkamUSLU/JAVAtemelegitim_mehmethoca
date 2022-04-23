package day07_ifElseIfStatements;

import java.util.Scanner;

public class Soru83_9 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan artık yıl olup olmadıgını kontrol etmek icin yıl girmesini isteyin.
           Kural1==>4 ile bolunemeyen yıllar artık yıl degildir.
           Kural2==>4 ile bolunup 100 ile bolunemeyen yıllar artık yıldır.
           Kural3==>4'un katı olmasına ragmen 100 ile bolunebilen yıllardan sadece 400'un katı olan yıllar artık yıldır.
         */
        System.out.println("Lutfen 0-2022 arası bir yıl giriniz= ");
        Scanner scan= new Scanner(System.in);
        int yıl=scan.nextInt();

        if(yıl%4!=0){System.out.println("Artık yıl degildir.");}
        else if(yıl%4==0 && yıl%100!=0){System.out.println("Artık yıldır.");}
        else if(yıl%4==0 && yıl%100==0 && yıl%400==0){System.out.println("Artık yıldır.");}
        else {System.out.println("Yıl degil ki artık yıl olsun.");
        }


    }

}
