package day16_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //Verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız.

        char ilkharf='c';
        char sonHarf='s';

        for (char i=ilkharf  ;i<=sonHarf; i++) {
            System.out.print(i+" ");
        }

        double baslangıc=10;
        double bitis=15;
        double artıs=0.2;

        //baslangıc ve bitis arasındaki artıs miktarı ile olusacak tum sayıları yazdırın.

        for (double i = baslangıc; i <=bitis ; i+=artıs) {
            System.out.print(i+" ");
        }


    }
}
