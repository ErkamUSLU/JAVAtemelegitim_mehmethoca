package day33_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {
        C01 obj = new C01();

        obj.acikString = "Bye";
        C01.acikSayi = 50;
        //C01.sayi=34; private access modifier oldugundan baska Class'dan erisilemez.
        //obj.method1(){   private access modifier oldugundan baska Class'dan erisilemez.}
        //C01 objParametreli = new C01(5); private access modifier oldugundan baska Class'dan erisilemez.

    }
}

