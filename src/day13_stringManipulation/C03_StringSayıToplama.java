package day13_stringManipulation;

public class C03_StringSayıToplama {
    public static void main(String[] args) {

        /*String seklinde verilen assagıdaki fiyatların toplamını bulun.
        String str1="$13,99";
        String str2="$10,55";
        ipucu:Double.parseDouble() methodunu kullanabiliriz.*/


        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");//1399 ama string
        str2=str2.replaceAll("\\D","");//1055 ama string

        double str1sayı=Double.valueOf(str1);
        double str2sayı=Double.valueOf(str2);

        double sonuc= (str1sayı+str2sayı)/100;

        System.out.println("verilen string sayıların toplamı= $"+sonuc);
    }
}
