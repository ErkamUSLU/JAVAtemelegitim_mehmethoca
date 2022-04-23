package pazarextra;

import java.util.Scanner;

public class Soru141_5 {
    public static void main(String[] args) {
        //Kullanıcıdan 100'den kucuk tamsayı isteyin.1'den baslayarak girilen sayıya kadar veya 5'in katı olan sayıları
        //yazdırın.
       Scanner scan = new Scanner(System.in);

        System.out.print("Bir tamsayı girin= ");
        int sayı=scan.nextInt();
        for (int i=sayı ; i <100 ; i++) {
            if(i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
