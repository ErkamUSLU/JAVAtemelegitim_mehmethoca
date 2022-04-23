package day12_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel.";

        System.out.println(str.substring(5));
        //Yukarıdaki Stringi kullanarak "Mehmet Hoca ile IT cok guzel." yazdırın.


        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet hoca "+ str.substring(5));


        System.out.println(str.substring(9));//Yazılan index inclusive



        //Eger bir indexten sona kadar olan parcayı degil belirli bir parcayı almak istersek iki parametre yazmalıyız.
        //str.substring(baslangicIndexi, bitisIndexi)
        //BaslangıcIndexi dahildir(inclusive).
        //BitisIndexi harictir(exclusive).


        System.out.println(str.substring(0,5));//0 dahil-inclusive 5 hariç-exclusive
        System.out.println(str.substring(0,1));//J yazar.

        //Bana 6. harfi String olarak bulun.

        String harf=str.substring(5,6);
        System.out.println(harf);//i

        str="Java gun gectikce guzellesiyor.";


        System.out.println(str.substring(7,7));
        //Inclusive-exclusive derken hicbir sey yazdırmaz.Son sozu exclusive soyler.Hiclik dondurur.

        //System.out.println(str.substring(5,2));
        //Buyuk sayıdan kucuk sayıya dogru giderken;5 den sonra 2 diye bir sayı olmayacagı icin hata verir.
        //Yani bitis indexi baslangıc indexinden kucuk olamaz.


        System.out.println(str.substring(str.length()-1));//Son harfi verir.
        System.out.println(str.substring(str.length()-5));//Son 5 harfi alır.

        System.out.println(str.substring(str.length()));//Son harften sonraki kısmı yani hiclik verir.

    }
}
