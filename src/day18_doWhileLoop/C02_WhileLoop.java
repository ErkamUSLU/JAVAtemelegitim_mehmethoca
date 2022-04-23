package day18_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın.

        int input=1234;
        int rakam=0;
        int rakamlartop=0;

        while (input>0){
            rakam=input%10;
            rakamlartop+=rakam;
            input/=10;
        }
        System.out.println(rakamlartop);
    }
}
