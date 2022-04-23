package day02Scanner01;
import java.util.Scanner;
public class C09_Scanner {
    public static void main(String[] args) {
        //soru 6-) Kullanıcıdan ismini ve soyismini alip aralarında bir bosluk olusturarak asagıdaki sekilde yazdırın
        // Isım - soyisim : Erkam Uslu

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi yaziniz.");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi yaziniz");
        String soyIsim=scan.nextLine();
        System.out.println("Isim -  soyisim : "  +  isim  +" "+soyIsim);
    }
}
