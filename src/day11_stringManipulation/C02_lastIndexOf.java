package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        //Kullanıcıdan bir cumle ve kelıme isteyin; kelimenin cumledeki kullanımına bakarak assagıdaki 3 cumledenuygun
        //olanı yazdırın.1-)Girilen kelime cumlede kullanılmamıs.
        //               2-)Girilen kelime cumlede 1 kere kullanılmıs.
        //               3-)Girilen kelime cumlede bircok kere kullanılmıs.

        String cumle="Java ogren,yeni program ile yeni bir sayfa ac.";
        String kelıme="yeni";

        int ilkkullanım=cumle.indexOf(kelıme);//-1 veya index
        int sonkullanım=cumle.lastIndexOf(kelıme);//

        if(ilkkullanım==(-1)){System.out.println("girilen kelime cumlede kullanılmamıs.");}
        else if (ilkkullanım==sonkullanım){System.out.println("girilen kelime cumlede bir kere kullanılmıs");}
        else {System.out.println("girilen kelime cumlede birden fazla kullanılmıs.");}


        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));//4 dahil bir arama yapıyor.
    }
}
