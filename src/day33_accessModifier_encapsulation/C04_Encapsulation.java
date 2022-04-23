package day33_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*Bir variable'i encapsule etmek icin
        1-)Access Modifier'i private yapariz
        2-)okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
            -eger sadece okunmasini istiyorsaniz getter
            -sadece deger girilebilsin ama okunamasin isterseniz setter
            methodlarinda olustururuz.
        Bir variable icin hem getter hem setter olusturursaniz o variable public olmus gibi hem okuyup
        hem de yazilmasini saglayabiliriz
         */

        C03 obj = new C03();
        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java");
        System.out.println(obj.getStr());//Java Java
        System.out.println(obj);//sayi=0, str= Java Java'



    }
}
