package pazarextra;

import java.util.Scanner;

public class Soru153_3 {
    public static void main(String[] args) {
        //Kullanıcıdan toplamak uzere pozitif sayılar isteyin, islemi bitirmek icin 0'a basmasını soyleyın.
        //Kullanıcı 0'a bastıgında toplam kac pozitif sayı girdigini ve girdigi pozitif sayılar toplamının kac oldugunu
        //yazdırın.



        Scanner scan = new Scanner(System.in);
        int num1=4;
        int toplam=0;
        int sayacNegatif=0;
        int sayacPozitif=0;

        do {
            System.out.println("Lutfen bir tamsayı girin= \nBitirmek icin 0'a basın.");
            num1=scan.nextInt();

            if (num1<0){
                System.out.println("Negatif sayı giremezsiniz.");
                sayacNegatif++;
            }
            else if( num1>0){
                toplam+=num1;
                sayacPozitif++;
            }
        }while (num1!=0);
        System.out.println("Yanlıslıkla girilen sayı adedi: "+sayacNegatif);
        System.out.println("Pozitif girilen sayı adedi:  "+sayacPozitif);
        System.out.println("Girilen sayılar toplamı: "+toplam);
    }
}
