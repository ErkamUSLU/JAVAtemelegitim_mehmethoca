package day22_multiDimentionalArrays;

public class Soru191_3 {
    public static void main(String[] args) {
        //Soru-3) Assagidaki multi dimensional array'lerin ic array' lerinde ayni index'e sahip elementlerin toplamini
        //ekrana yazdiran bir program yaziniz arr1={{1,2},{3,4,5},{6}}   arr2={{7,8,9},{10,11},{12}}


        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};



        int toplam=0;
        for (int i = 0; i < arr1.length && i < arr2.length; i++ ) {
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {
                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(j+". indexteki elemanlarin toplami : "+ toplam);

            }

        }



    }
}
