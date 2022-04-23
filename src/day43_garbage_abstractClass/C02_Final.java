package day43_garbage_abstractClass;

public class C02_Final {
    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi);
        //C01_Final.okulIsmi="Hasan koleji";
    }

    public static final void method1(){
        System.out.println("parent class final method1");
    }
}
