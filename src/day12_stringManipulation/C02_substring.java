package day12_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        //1-48 of 104 results for "nutella"
        //Bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise super az ise "Az sonuc bulundu." yazdıralım.


        String str = "1-48 of 104 results for \"nutella\"";
        //Bu \ isaretlerini Java otomatik koyuyor.


        int ilkSpace=str.indexOf(" ");//4
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuspace=str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayısı= str.substring(ikinciSpace+1,ucuncuspace);


        int aramaSonucSayısıInt= Integer.valueOf(aramaSonucSayısı);
        System.out.println(aramaSonucSayısıInt);

        if (aramaSonucSayısıInt>100){
            System.out.println("Super...");}
        else{
            System.out.println("Az sonuc bulundu.");
        }

    }
}
