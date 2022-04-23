package day14_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;


        //Iki variable'in degerlerini toplayan bir method olusturalım.

        //1.adım : method adını yazalım
        //2.adım : methoda gondermem gereken argument var mı?


        //Bir methodu olusturmak calısması icin yeterli degildir. method ancak cagrılırsa calısır. Aynı class veya farklı
        //class'da olmasının hicbir onemi yoktur. java yukarıdan assagı, soldan saga dogru calısır.
        //Aynı class veya farklı cass'da olmasının hicbir onemi yoktur.Java main method'da yukarıdan assagı dogru
        //calısır ve geldigi satırı calıstırır.
    ikiSayıTopla(25,25);
    C04.besHarfiTersineCevir("dcscc");

    }

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("Verilen iki sayının toplamı: "+ (a+b));


    }
}
