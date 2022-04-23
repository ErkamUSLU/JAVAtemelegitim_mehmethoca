package day25_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,11};

        //Elementleri for loop ile yazdirin

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");


        }
        System.out.println("");

        //Bunu for each loop ile yapalim

        for (int each : arr
             ) {
            System.out.print(each +" ");
        }

        //for each loop'u calistirmak icin hedef bir collection vermeliyiz.

        //Avantajlari: index baslangic degeri bitis degeri gibi detaylarla ugrasmamiza gerek kalmadan collections'dan
        //tum elementleri bize getirir.
        //Dezavantajlari: index'e bagli bir islem yapamayiz.

    }
}
