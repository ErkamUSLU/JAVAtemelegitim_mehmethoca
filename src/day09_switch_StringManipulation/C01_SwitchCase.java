package day09_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //Kullanıcıdan sayı olarak ay numarasını alıp istenen ay ismini yazdıran bir program yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldugunu giriniz= ");
        int ayNo=scan.nextInt();

        //Bu soruyu if-else yontemiyle yaparsak ard arda 12 if-else cok kalabalık ve anlasılması guc olabilir. Bunun
        //yerine SwitchCase kullanabiliriz.

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarası giriniz.");


        }

        //switch icine yazılan variable'nin degerine gore ilgili case'i bulur; ve break gorene kadar kodu calıstırır.
        //Eger break yoksa ilgili case'den assagı dogru tum caseler calısır.
        //if-else'deki son else gibi, geriye kalan durumları tamamen kapsayacak bir satır daha ekleyebiliriz.
    }
}
