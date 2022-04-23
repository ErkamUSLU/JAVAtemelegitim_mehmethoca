package day28_staticKeyward;

public class C01_Static {
    String okulIsmi= "Yildiz Koleji";
    static String okulTelefonu="6456546";


    public static void staticMethod() {
        System.out.println("Static method calisti");
    }

    public void staticOlmayanMethod() {
        System.out.println("Static olmayan method calisti");
    }
}
