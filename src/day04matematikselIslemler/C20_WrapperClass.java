package day04matematikselIslemler;

public class C20_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";
        //verilen iki string'deki sayilari toplayın
        System.out.println(str1+str2);//1234523456
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//35801


        //Integer.valueOf(str1) methodu sadece sayisal deger iceren string'lerde kullanılabilir
        //bir tane bile sayi degeri dısında karakter olursa java hata verir
    }
}
