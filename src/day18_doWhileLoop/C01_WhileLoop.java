package day18_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve bu sayıyı tam bolen sayılar ile toplam kac tane olduklarını yazdıralım.
        //for loop ile de yapılabilir

        int input = 6;
        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if(input%bolen==0){
                System.out.print(bolen+" ");
                sayac++;//kac tane oldugunu sayıyor
            }
            bolen++;//bunu yazmazsak sonsuz donguye girer yani ending loop
        }
        System.out.println("");
        System.out.println(input+" sayısını bolen "+sayac+" adet sayı vardır..." );
    }
}
