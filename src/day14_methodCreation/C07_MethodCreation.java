package day14_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //String'i yazdıran bir method olusturalım.

        //"Hosgeldiniz diyen bir method olusturun.

        //Kapanma mesajı yazan bir method yazalım.


        hosgeldinYazdır();

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkurler.");
    }

    public static void hosgeldinYazdır() {
        System.out.println("Hosgeldin");
        stringYazdır("boyle de olur");
    }

    private static void stringYazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();

    }
}
