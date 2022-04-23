package day10_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {


        String str="Java Guzeldir.";

        //Biz string method'larını arka arkaya kullanabiliriz.
        //Mesela ikinci kelimenin ilk harfini kucuk harfle yazdıralım.



        //str.charAt(5)  ==> boyle yazdıgımızda artık String degil char olacaktır.
        //Dolayısıyla String'de yapmak istedigimiz tum degisiklikleri once yapıp sonra charAt kullanmalıyız.
        System.out.println(str.toLowerCase().charAt(5));


        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDİR.
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));//JAVA GUZELDIR.


    }
}
