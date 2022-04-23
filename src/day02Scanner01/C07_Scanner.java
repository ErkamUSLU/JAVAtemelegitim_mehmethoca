package day02Scanner01;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adım takip ediyoruz
        //1.adım-) kendimize bir scanner olusturmak
        Scanner scan = new Scanner(System.in);//esitligin sagında yeni bir scanner olusturulur
                                              //ve olusturulan bu scanner scan variable'na assign edilir
                                              //scan variable'in ismidir. Istedigimiz ismi verebiliriz.
        //2.adım-) kullanıcının istedigimiz degeri girmesi icin acıklayıcı bir bilgi yazdırın
        System.out.println("lütfen isminizi giriniz");
        //3.adım-) kullanıcının girdiği degeri uygun bir variable olusturun kaydedin.
        String kullanıcıAdı= scan.nextLine();// next()=sadece ilk kelimeyi alır(ilk space'e kadar olan kısmı alır)

        String kullanıcıSoyadı= scan.next();// nextline()=tüm kelimeleri alır
        System.out.println("Kullanıcının girdigi isim:"+ kullanıcıAdı+' '+kullanıcıSoyadı);

    }
}

