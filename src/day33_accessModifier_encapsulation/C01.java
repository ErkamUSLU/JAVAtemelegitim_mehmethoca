package day33_accessModifier_encapsulation;

public class C01 {

    private static int sayi = 10;
    private static String str = "Java";
    static int acikSayi;//Access Modifier'i default Access Modifier.
    String acikString="Hi";//Access Modifier'i default Access Modifier.
    public static int halkaAcikSayi=15;
    protected static int aileyeozel=1;
    protected C01() {//bu contructor'in Access Modifier'i default Access Modifier.
           //dolayisiyla icinde oldugumuz package disinda bu Class'dan
           // obje olusturulamaz
    }
    private C01(int numara){
        System.out.println("parametreli constructor calisti");

    }
    private void method1(){
    }

}