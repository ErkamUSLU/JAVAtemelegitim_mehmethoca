package day11_stringManipulation;

public class C03_contain {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin. mail @gmail.com icermiyorsa  “Lutfen @gmail adresi
        //giriniz.”; @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “; @gmail.com ile bitmiyorsa "Lutfen yazımı
        //kontol edin." yazdırın.

        String email= "mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";


        if (!email.contains(arananMetin)){System.out.println("Lutfen @gmail adresi yazınız.");}
        else if (email.lastIndexOf(arananMetin)==email.length()-10){System.out.println("email adresiniz kaydedildi.");}
        else{System.out.println("Lutfen yazımı kontrol edin.");}
    }
}
