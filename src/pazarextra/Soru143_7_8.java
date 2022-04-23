package pazarextra;

import java.util.Scanner;

public class Soru143_7_8 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Interview Question//Kullanıcıdan bir string isteyin ve stringi tersten yazdırın.



       tersCevir();

    }

    private static void tersCevir() {


        System.out.println("Bir metin girin= ");
        String text = scan.nextLine();
        String terstext = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            terstext = terstext + text.charAt(i);
        }
        System.out.println(terstext);


    }
}




