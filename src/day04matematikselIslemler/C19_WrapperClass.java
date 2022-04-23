package day04matematikselIslemler;

public class C19_WrapperClass {
    public static void main(String[] args) {
        short sayi1=20;
        Short sayi2=30;
        sayi1=sayi2;//Wrapper Class ile ayni isimdeki Wrapper Class arasında gecis olabilir
        System.out.println(sayi1);//30
        System.out.println(Short.MAX_VALUE );//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.BYTES);//2 Byte=16 bit


    }
}