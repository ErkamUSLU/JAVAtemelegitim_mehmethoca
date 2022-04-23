package day10_stringManipulation;

import java.util.Scanner;

public class Soru106_2 {
    public static void main(String[] args) {

        //Kullanıcıdan bir cumle ve kelıme isteyin; kelimenin cumledeki kullanımına bakarak assagıdaki 3 cumledenuygun
        //olanı yazdırın.1-)Girilen kelime cumlede kullanılmamıs.
        //               2-)Girilen kelime cumlede 1 kere kullanılmıs.
        //               3-)Girilen kelime cumlede bircok kere kullanılmıs.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz :");
                String cumle = scanner.nextLine();
                System.out.println("Lütfen bir kelime giriniz");
                String kelime = scanner.nextLine();

                int indexKelime = cumle.indexOf(kelime);
                int lastIndexKelime = cumle.lastIndexOf(kelime);



                if(indexKelime==-1){
                System.out.println("Kelime bu cumlede kullanılmamış.");}
                else if ( indexKelime == lastIndexKelime){System.out.println("Kelime bu cümlede 1 kere kullanılmış");}
                else {System.out.println("Kelime bu cümlede bircok kere kullanılmış");}
    }
}