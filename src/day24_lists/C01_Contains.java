package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String>harfler = new ArrayList<>();
        harfler.add("D");
        harfler.add("M");//sona ekleyerek devam eder.
        harfler.add(1,"T");
        harfler.add(0,"T");//Java virgulden sonra otomatik bosluk birakir


        System.out.println(harfler);


        harfler.contains("T");// bize true doner
        System.out.println(harfler.contains("T"));//true
        System.out.println(harfler.contains("G"));//false


        List<String>karakterler= new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");


        System.out.println(harfler.containsAll(karakterler));//true
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler));//false




    }
}
