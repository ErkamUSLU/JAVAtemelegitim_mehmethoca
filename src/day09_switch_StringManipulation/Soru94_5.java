package day09_switch_StringManipulation;

import java.util.Scanner;

public class Soru94_5 {
    public static void main(String[] args) {
        //Kullanıcıdan gun ismini alıp haftaici veya haftasonu yazdırın.

        System.out.print("Lutfen gunu yazınız= ");
        Scanner scan= new Scanner(System.in);
        String day=scan.next().toUpperCase();
        switch (day) {
            case "PAZARTESI":
                System.out.println("Haftaici");
                break;
            case "SALI":
                System.out.println("Haftaici");
                break;
            case "CARSAMBA":
                System.out.println("Haftaici");
                break;
            case "PERSEMBE":
                System.out.println("Haftaici");
                break;
            case "CUMA":
                System.out.println("Haftaici");
                break;
            case "CUMARTESI":
                System.out.println("Haftasonu");
                break;
            case "PAZAR":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen haftanın 7 gun cektigine dikkat edin...");
        }
    }
}
