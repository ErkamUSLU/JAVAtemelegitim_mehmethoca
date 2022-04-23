package day08_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Ternary ile yapılan tum islemler if-else ile de yapılabilir.
        //if-else yerine ternary tercih etme sebebi yapının basit ve anlasılabilir olmasıdır.
        //Ternary icerisinde kompleks kodlar olmaz.
        //Sadece sonuc veya bizi sonuca goturen basit islemler olabilir.


        //Kullanıcıdan bir tam sayı alıp tek mi cift mi yazdıran bir kod yazalım.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayı giriniz= ");
        int sayı=scan.nextInt();


        //if-else li cozum
        if (sayı%2==0){System.out.println("sayı cift");}
        else{System.out.println("satı tek");}

        //ternary li cozum
        System.out.println(sayı%2==0 ? "sayı cift" : "sayı tek");




    }
}
