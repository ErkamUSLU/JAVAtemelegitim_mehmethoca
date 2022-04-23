package day07_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        //soru-)Kullanıcıdan 100 uzerinden notunu isteyin. Notu harfsel degere cevirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz= ");

        double notSayı=scan.nextDouble();

        if(notSayı<0 || notSayı>100){System.out.println("Gecerli degildir.");}

        else if(notSayı<50){System.out.println("Notunuz D'dir");}

        else if(notSayı<60){System.out.println("Notunuz C'dir.");}

        else if(notSayı<80){System.out.println("Notunuz B'dir.");}

        else{System.out.println("Notunuz A'dır.");}

    }
}
