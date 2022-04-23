package day14_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        String str="Java ogrenmek cok zevkli";

        //str'nin ilk 4 harfini almak istersek
        str.substring(0,4);

        //Bir program yaparken kodlarımızın daha kısa ve anlasılır olması icin kod bloklarını bir yere koyar ihtiyacımız
        //oldukca oradan alıp kullanırız.


        //Methodlar robotlara benzer. Method olusturmak bazen o methodun yapacagı isi yapmaktan daha zor olabilir. Bir
        //islemi yalnız bir kere yapacaksak method kullanmamıza gerek olmayabilir. Ancak ozellikle cok kullanacagımız
        //islemler icin her seferinde yeniden aynı kodları yazmak yerine bu islemi yapan hazır bir method olustırmak
        //cok daha pratiktir.

        //Bazen bir class'ın icinde cok uzun kodlar yazarsak tum class'ın anlasılması zorlasabilir. Bunun yerine kodun
        //belirli kısımlarını ayrı methodlar olarak olusturup main method icerisinden istedigimiz sekilde bu methodları
        //yonetebiliriz.
    }
}
