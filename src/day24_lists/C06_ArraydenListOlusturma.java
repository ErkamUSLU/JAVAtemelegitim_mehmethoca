package day24_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //Verilen bir array'i listeye cevirin


        String arr[] = {"A","B","C"};
        List<String>arraydenList=Arrays.asList(arr);
        //Arrayden liste cevirince yeni listin uzunlugunu degistiremeyiz.
        //Dolayisiyla yeni list ile add() , remove(), clear() gibi methodlar calistirmak exception olusturur.

        //arraydenList.add("J");//UnsupportedOperationException
        //exception bir hata degil!!


        System.out.println("19.satirda list:"+ arraydenList);

        arr[1]= "F";


        System.out.println("25.satirda Array:" + Arrays.toString((arr)));
        System.out.println("26.satirda list:" + arraydenList);



    }
}
