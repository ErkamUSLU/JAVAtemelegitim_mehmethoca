package day06_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        if (a == b) {
            System.out.println("Verilen sayılar esittir.");
        }


        if (a > 100) {
            System.out.println("'a' yuzden buyuktur.");
        }


        if (a * b > 1) {
            System.out.println("Sayiların carpımı 5'ten buyuktur. ");
        }


        /*
        Bagimsiz if cümleleri kendileri dısındaki kodlarla ilgilenmezler
        Bir sart ve o sarta bagli sonuca odaklıdır
        Birden fazla bagimsiz if cumlesi oldugunda hepsinin body'si calısabilecegi gibi
        Hicbirisinin body'si calısmayabilir
         */

    }
}
