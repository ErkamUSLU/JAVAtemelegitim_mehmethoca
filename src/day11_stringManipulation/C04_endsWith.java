package day11_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin. mail @gmail.com icermiyorsa  “Lutfen @gmail adresi
        //giriniz.”; @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “; @gmail.com ile bitmiyorsa "Lutfen yazımı
        //kontol edin." yazdırın.

        String email= "mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){System.out.println("Lutfen gmail adresini yazınız.");}
        else if(email.endsWith(arananMetin)){System.out.println("Email adresiniz kaydedildi.");}
        else{System.out.println("Lutfen yazımı kontrol edin.");}
        System.out.println(arananMetin.startsWith("l",5));
    }
}
