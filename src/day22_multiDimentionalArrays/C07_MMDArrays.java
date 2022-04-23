package day22_multiDimentionalArrays;

import java.util.Scanner;

public class C07_MMDArrays {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle girin= ");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi= "+arr.length);

    }
}
