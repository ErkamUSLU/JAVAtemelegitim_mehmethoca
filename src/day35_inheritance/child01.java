package day35_inheritance;

public class child01 extends Parent{
    public static void main(String[] args) {

       //child class hicbir objeye ihtiyac duymadan parent classdaki variable ve methodlara ulasabilir.

        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();

    }
}
