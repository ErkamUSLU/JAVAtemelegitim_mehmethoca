package day04matematikselIslemler;

public class C16_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi1 +", "+sayi2+", "+sayi3);


        sayi3=++sayi1;

        System.out.println(sayi1+", "+sayi2+", "+sayi3);

        System.out.println(sayi3++);//once yazdıracak sonra artıracak 12 (PostIncrement)
        System.out.println(--sayi2);//once azaltacak sonra yazdıracak 9  (PreDecrement)


    }
}
