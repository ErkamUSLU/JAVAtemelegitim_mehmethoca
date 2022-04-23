package pazarextra;

import java.util.Scanner;

public class Soru154_6 {
    public static void main(String[] args) {
        //Kullanıcıdan  toplamak icin sayi isteyin ve toplam 500'e ulasıncaya kadar devam edin. Toplam 500 'e ulasınca
        //veya gectiginde toplamı ve kac sayı girildigini yazdırın.

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("lutfen bir sayi giriniz");
            int sayı = scan.nextInt();
            toplam += sayı;
        }while (toplam<500);
    }
}