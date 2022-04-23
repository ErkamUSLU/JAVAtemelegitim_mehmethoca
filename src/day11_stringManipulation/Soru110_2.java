package day11_stringManipulation;

import java.util.Scanner;

public class Soru110_2 {
    public static void main(String[] args) {
        //Kullanıcıdan bir cumle istesyin. Cumle "buyuk kelimesi" iceriyorsa tum cumleyi buyuk harfle;
        //"kucuk" kelimesi iceriyorsa tum cumleyi kucuk harfle yazdırın. Iki kelimeyi de icermiyorsa " Cumle kucuk ya da
        //buyuk kelimesi icermiyor." yazdırın.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz=");
        String cumle=scan.nextLine();
        if (cumle.contains("buyuk")||cumle.contains("kucuk")){
            System.out.println(cumle+" cumlesi her iki kelimeyi de iceriyor.");}
        else if (cumle.contains("buyuk")){System.out.println(cumle.toUpperCase());}
        else if (cumle.contains("kucuk")){System.out.println(cumle.toLowerCase());}
        else{System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor.");
        }
    }
}
