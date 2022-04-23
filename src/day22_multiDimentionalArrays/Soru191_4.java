package day22_multiDimentionalArrays;

public class Soru191_4 {
    public static void main(String[] args) {
        //Assagidaki multidimensional array'in ic array'larindaki tum elemanlarn toplamini birer birer bulan ve herbir
        //sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana yazdiran bir program yazin.
        //{{1,2,3},{4,5},{6,7}}
        int arr[][]={{1,2,15},{4,5},{6,7}};

        arrayOlus(arr);

    }

    public static void arrayOlus(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

              toplam+=  arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}

