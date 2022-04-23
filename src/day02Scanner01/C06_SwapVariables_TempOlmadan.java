package day02Scanner01;
import java.util.Scanner;
public class C06_SwapVariables_TempOlmadan {
    public static void main(String[] args) {

        /*
        1-) Verilen sayi1 ve sayi2 variable’larinin degerlerini ucuncu bir variable kullanmadan degistiren (SWAP)
             bir program yaziniz
        Orn: sayi1=10 ve sayi2=20;
             kod calistiktan sonra
             sayi1=20 ve sayi2=10;
        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi giriniz: ");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("Girdiginiz sayılardan ilki= "+sayi1);
        System.out.println("Girdiginiz sayılardan ikincisi= "+sayi2);

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("swap sonrası sayi1= "+sayi1);
        System.out.println("swap sonrası sayi2= "+sayi2);




    }
}

