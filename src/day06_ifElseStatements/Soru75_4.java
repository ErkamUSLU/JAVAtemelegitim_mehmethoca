package day06_ifElseStatements;

import java.util.Scanner;

public class Soru75_4 {
    public static void main(String[] args) {
        /*
        Soru-4)Kullanıcıdan bir ucgenin uc kenar uzunlugunu alın. Eger uc kenar uzunlugu birbirine esit ise ekrana
        "Eskenar ucgen" yazdırın. Diger durumlarda ekrana "Eskenar ucgen degil" yazdırın.
         */
        System.out.println("Lutfen ucgeninizin kenarlarını giriniz.");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kenar1= ");
        int kenar1=scan.nextInt();
        System.out.println("Kenar2= ");
        int kenar2=scan.nextInt();
        System.out.println("Kenar3= ");
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar3==kenar2){
            System.out.println("Eskenar ucgen");
        }
        else if((kenar1==kenar2 && kenar3!=kenar1)||(kenar1==kenar3 && kenar2!=kenar3)||(kenar2==kenar3 && kenar1!=kenar3)){
            System.out.println("Ikızkenar ucgen");
        }
        else{
            System.out.println("Cesitkenar ucgen");
        }

    }
}
