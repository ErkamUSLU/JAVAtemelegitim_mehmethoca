package day06_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        //kullanıcıdan yasını isteyin
        //65 den buyukse==> emekli olabilirsin yazdırın
        //65 den kucukse==> emekli olamazsın yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen yasınızı giriniz= ");

        int yas=scan.nextInt();

        if(yas>=65){
            System.out.println("EMEKLI OLABILIRSIN!");

        }
        else {
            System.out.println("EMEKLI OLAMAZSIN!");
            System.out.println(65-yas +" SENE DAHA CALISMALISIN! ");
        }

/*
if else statement'larda iki durumdan sadece ve sadece biri calisir
ikisinin birden calısma ihtimali ====> yok
ikisinin de calısmama ihtimali ====> yok
*/

    }
}
