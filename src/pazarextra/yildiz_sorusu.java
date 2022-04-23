package pazarextra;

public class yildiz_sorusu {
    public static void main(String[] args) {
           /*asagidaki sekilde  cikti verecek formulu yazin
              A
             BBB
            CCCCC
           DDDDDDD
          EEEEEEEEE */

        for (int i = 1 , c='A' ; i <6 ; i++,c++) {//1-2-3
            for (int j = i; j <6 ; j++) {
                System.out.print(" ");//5-4-3
            }

            for (int j = 1; j <=i ; j++) {//1-2
                System.out.print((char)c);
            }
            for (int j = 1; j <i ; j++) {// -1
                System.out.print((char)c);
            }
            System.out.println();
        }
    }
}
