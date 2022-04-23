package pazarextra;

public class Soru148_2 {
    public static void main(String[] args) {
        //For Loop ve While Loop kullanarak 3 basamaklı sayılardan 15,20 vee 90'a tam bolunebilen sayıları yazdırın.
      /*  int num = 100;
        while (num <= 999 && num >= 100) {
                if ((num % 15 == 0 && num % 20 == 0 && num % 90 == 0)) {
                System.out.print(num + " ");
                }
                num++;*/


        for (int i = 100; i <= 999; i++) {
            if ((i % 15 == 0 && i % 20 == 0 && i % 90 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}


