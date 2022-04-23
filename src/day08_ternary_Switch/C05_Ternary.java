package day08_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //Bazen ternary'deki iki sonucun data turleri faklı olabilir.
        //Verilen sayı 100'den buyukse sayı'nın karesini alıp yazdıran 100'den kucukse "sayı 100'den buyuk olmalı"
        // yazdıran bir ternary olusturalım.

        int sayı=150;
        //Ternary bize sonuc getirdiginden ya sonucu direk yazdırmalıyız ya da bir degiskene atamalıyız.
        //Eger sonuclar farklı data turlerinde ise atama yapacagımız variable'in data turu tek olacagından atama yapamayız.
        //Sadece direkt yazdırabiliriz.
        System.out.println(sayı>100 ? sayı*sayı : "Sayı 100'den buyuk olmalıdır.");
    }
}
