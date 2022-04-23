package day09_switch_StringManipulation;

import java.util.Scanner;

public class Soru94_4 {
    public static void main(String[] args) {
        /*Kullanıcıdan SDET kısaltmasındaki harflerden nirini yazmasını isteyin.
          Kullanıcı S girerse "Software"
          D girerse "Developer"
          E girerse "Engineer"
          T girerse "Tester" yazdırın
         */
        System.out.print("Lutfen S,D,E,T harflerinden birini girin= ");
        Scanner scan = new Scanner(System.in);
        String a=scan.next().toUpperCase();
        System.out.println("Girilen karakter==> "+a);
        switch(a){
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("Tester");
                break;
            default:
                System.out.println("Girdigin karakteri degistir.");
        }
    }
}
