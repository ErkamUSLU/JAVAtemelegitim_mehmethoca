package day08_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayı=5353;
        //Verilen sayının 3 veya daha cok basamakalı olup olmadıgını kontrol eden ve sonucu yazdıran
        //bir ternary olusturun.

       String sonuc = sayı>=100 ? "sayı 3 basamaklı veya daha buyuk" : "sayı negatif veya 3 basamaktan kucuk";

       //Ternary bize sonuc dondurdugu icin ya bu sonucu dırekt yazdırmalıyız ya da sonucun data turune uygun bir
       // atama yapabiliriz.

       System.out.println("Girdiginiz sayı analizi: "+sonuc);



    }
}
