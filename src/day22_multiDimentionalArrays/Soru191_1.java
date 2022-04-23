package day22_multiDimentionalArrays;

public class Soru191_1 {
    public static void main(String[] args) {
        //Soru-1) Assagidaki multidimentional array' in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
        //{{1,2,3}{4,5,6}}

        int arr[][]={ {1,2,3}, {4,5}, {6,0,2} };

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println("elementler toplami= "+ toplam);
      }
    }

