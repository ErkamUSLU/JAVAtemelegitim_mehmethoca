package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Soru-12) Kullanıcıdan pozitif bir rakam girmesini isteyin ve girilen rakama göre assagıdaki seli cizin.
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *


        int input = 5;



        for (int i = 1; i <= input ; i++) {

            for (int j = 1; j <=i ; j++) {
                //nested for loop ya dıkdortgen yada ucgen olabılır
                //dıkdortgen ıstedıgımızde ıkı loop ıcın de bagımsız end poınt belirleriz
                //ucgen seklı vermek icin inner loop'un end poınt'i olarak outer degiskene baglı yaparız
                System.out.print("* ");
            }
            System.out.println("");

        }





    }
}
