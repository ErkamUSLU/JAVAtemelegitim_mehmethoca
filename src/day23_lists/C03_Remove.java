package day23_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();


        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7) ;
        sayilar.add(2,7);
        System.out.println(sayilar);
        sayilar.remove(3);//index olarak 3 deki elementi siler

       // sayilar.remove(5);//IndexOutOfBoundsException hatasi
       //sayilardan olusan bir list'te objeyi vererek element silme method'u calismaz
       //sayi degeri girince java otomatik olarak index kabul eder

       /* int sayi=5;
        sayilar.remove(sayi); //IndexOutOfBoundsException hatasi*/

        Integer sayi= 5;// integer wrapper class olarak kullaninca sayi obje oldugundan bu method calisti
        sayilar.remove(sayi);
        System.out.println(sayilar);

    }
}
