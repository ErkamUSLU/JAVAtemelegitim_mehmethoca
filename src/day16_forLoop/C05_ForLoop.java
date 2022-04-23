package day16_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru-)4 Kullanıcıdan 100'den kucuk bir tamsayı isteyin. 1'den baslayarak girilen sayıya kadar 3'un katı olan
        //sayıları yazdırın.
        int sayı=57;
        for (int i = 1; i <=sayı ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
