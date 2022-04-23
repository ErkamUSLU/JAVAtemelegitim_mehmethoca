package day04matematikselIslemler;

import java.util.Locale;

public class C18_WrapperClass {
    public static void main(String[] args) {
        //primitive data turu ile non-primitive arasındaki farklar nelerdir?
        String str="Java";
        int sayi1=10;
        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);//atama olmadıgı icin str oldugu gibi duruyor

        System.out.println(str.charAt(2));
        //non-primitive turleri data depolamak yanında bircok faydalı method'a sahiptir
        //ancak primitive data turlerinin boyle bir ozelligi yoktur
        //primitive data türleri sadece degerleri saklarlar(container)
        //primitive data turleri icinde bazi methodlar gerekli oldugunda
        //Java ara bir cozum uretmistir
        //Java herbir primitive data turunu non-primitive olarak kullanabilmek icin
        //ozel Classlar olusturmustur ve bunlara Wrapper Class adını vermistir
        double sayi2=20.5;
        //sayi2 primitive oldugundan sayi2. dedigimizde hicbir method gelmez
        Double sayi3= 15.2;
        //sayi3 Wrapper Class olan Double Classını kullandıgından
        //sayi3. dedigimizde bircok method gelir


    }
}
