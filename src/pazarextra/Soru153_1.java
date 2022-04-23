package pazarextra;

import java.util.Scanner;

public class Soru153_1 {
    public static void main(String[] args) {
        //9 den 190 e kadar 7 nın katı olan tum tamsayıları ekarana yazdırın.

        Scanner scan = new Scanner(System.in);
        int input=scan.nextInt();
        do {if (input%7==0) {
                System.out.print(input + " ");
            }input++;}
        while (( input< 190 && input>= 9));
    }
}