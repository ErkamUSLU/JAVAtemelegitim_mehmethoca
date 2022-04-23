package day51_maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static day49_maps.MapOlustur.myMap;

public class C02_IstenenElementleriListele {
    /*Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
    mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil è java
    Sonuc è [Ali, Veli]*/
    public static void main(String[] args) {

        Map<Integer,String>sinifMap = MapOlustur.myMap();
        String istenenDil = "Java";
        List<String> istenenDiliBilenler = istenenDiliBilenListesiOlustur(sinifMap,istenenDil);
    }

    private static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {
        List<String>istenenDiliBilenListesi = new ArrayList<>();

 return istenenDiliBilenListesi; }
}
