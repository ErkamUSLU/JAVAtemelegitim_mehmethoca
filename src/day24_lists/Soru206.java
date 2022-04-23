package day24_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru206 {
    public static void main(String[] args) {
        //Elemanlari A,C,E ve F olan bir String ArrayList olusturup ekrana yazdirin.

        List<String>harfcikler=new ArrayList<>();
        harfcikler.add("A");
        harfcikler.add("C");
        harfcikler.add("E");
        harfcikler.add("F");

        harfcikler.add("B");
        harfcikler.add(1,"L");


        harfcikler.set(3,"D");

        System.out.println(harfcikler);

        harfcikler.remove("F");
        System.out.println(harfcikler);

        Collections.sort(harfcikler);
        System.out.println(harfcikler);

        System.out.println(harfcikler.contains("L"));
        System.out.println(harfcikler.contains("M"));

        System.out.println(harfcikler.size());
        harfcikler.clear();

        System.out.println(harfcikler.isEmpty());


    }
}
