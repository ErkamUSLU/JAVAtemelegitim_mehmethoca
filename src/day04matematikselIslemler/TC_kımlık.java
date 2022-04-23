package day04matematikselIslemler;

import java.util.Scanner;

public class TC_kımlık {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen TC. kimlik numaranızı giriniz= ");

        long rakam=0;
        long rakamlarToplami=0;
        long num= scan.nextLong();

        rakam=num%10;//8
        rakamlarToplami+=rakam;//8
        num/=10;//7431400027

        rakam=num%10;//7
        rakamlarToplami+=rakam;//15
        num/=10;//743140002

        rakam=num%10;//2
        rakamlarToplami+=rakam;//17
        num/=10;//74314000

        rakam=num%10;//0
        rakamlarToplami+=rakam;//17
        num/=10;//7431400

        rakam=num%10;//0
        rakamlarToplami+=rakam;//17
        num/=10;//743140

        rakam=num%10;//0
        rakamlarToplami+=rakam;//17
        num/=10;//74314

        rakam=num%10;//4
        rakamlarToplami+=rakam;//21
        num/=10;//7431

        rakam=num%10;//1
        rakamlarToplami+=rakam;//22
        num/=10;//743

        rakam=num%10;//3
        rakamlarToplami+=rakam;//25
        num/=10;//74

        rakam=num%10;//4
        rakamlarToplami+=rakam;//29
        num/=10;//7

        rakam=num%10;//7
        rakamlarToplami+=rakam;//36
        num/=10;

        System.out.print("TC kimlik numaranızın rakamlar toplamı= "+rakamlarToplami+"'dır.");







    }
}
