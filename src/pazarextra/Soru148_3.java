package pazarextra;

import java.util.Scanner;

public class Soru148_3 {
    public static void main(String[] args) {
        //Kullanıcıdan baslangıc ve bitis degerlerini alın. Baslangıc degeri ve bitis degeri dahil aralarındaki tum cift
        //tamsayıları while loop kullanarak ekrana yazdırın.
        Scanner scan = new Scanner(System.in);
       int num=5131;
        System.out.print("Lutfen baslangıc degeri girin= ");
        int baslangıc=scan.nextInt();

        System.out.print("Lutfen bitis degeri girin= ");
        int bıtıs=scan.nextInt();
        while(num>=baslangıc && num<=bıtıs){
            if (num%2==0){
                System.out.print(num+" ");
            }
            else if (num<=0){num=1;}
            num++;
        }
    }
}