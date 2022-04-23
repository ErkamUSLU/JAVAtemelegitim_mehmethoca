package day09_switch_StringManipulation;

import java.util.Scanner;

public class Soru94_2 {
    public static void main(String[] args) {
        //Kullanıcıdan kacıncı ay oldugunu sorun ve ay ismini yazdırın.

        System.out.print("Lutfen yılın kacıncı ayı oldugunu yazınız= ");
        Scanner scan= new Scanner(System.in);
        int ay=scan.nextInt();
        switch (ay) {
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
            case 12:
                System.out.println("Aralık");
            default:
                System.out.println("Lutfen aylardan 12 sinden birini girin...");
        }
    }
}
