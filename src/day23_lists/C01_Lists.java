package day23_lists;

import day22_multiDimentionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {


        int arr[]={};
        //bu array'a 5 ekleyelim

        C06_Arrays obj= new C06_Arrays();
        arr=C06_Arrays.arrayeElemeanEkle(arr,5);
        System.out.println(Arrays.toString(arr));
        
        
        //bir de 3 ekleyelim
        
        arr=C06_Arrays.arrayeElemeanEkle(arr,3);
        System.out.println(Arrays.toString(arr));


        //bir list olusturalim

        List<Integer> sayilarList= new ArrayList<>();
        System.out.println(sayilarList);//bos bir array yazar


        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7) ;
        sayilarList.add(2,7);
        System.out.println(sayilarList);


    }
}
