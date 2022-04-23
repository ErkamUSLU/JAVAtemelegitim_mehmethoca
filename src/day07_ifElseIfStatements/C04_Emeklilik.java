package day07_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        /*
        Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        calisan erkekse 65 yasindan buyukse emekli olabilir.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen cinsiyetinizi yazınız= " +
                "\nKadın icin K\nErkek icin E harfini giriniz.");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.print("Lütfen yasınızı giriniz= ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas<0 || yas>120){System.out.println("Lütfen girdiginiz yas degerini kontrol edin.");}
            else if (yas<60){System.out.println("Emekli olamazsın\n" + "Daha" + (60-yas) + "yıl calısman gerekir.");}
            else {System.out.println("Emekli olabilirsin.");}}
        else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {System.out.println("Lütfengirdiginiz yas degerini kontrol edin.");}
            else if (yas < 65) {System.out.println("Emekli olamazsın\nDaha " + (65 - yas) + "yıl daha calısman gerekir.");}
            else {System.out.println("Emekli olabilirsin.");}}
        else{System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz.");}

}
}





