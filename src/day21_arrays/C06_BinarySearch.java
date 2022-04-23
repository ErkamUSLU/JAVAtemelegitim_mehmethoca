package day21_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=3;



        // Eger Javadan hazir binarSearch ile yapmak isterseniz once sort methodunu kullanip sonra
        // binarySearch yapmaliyiz.
        // binarsearch methodu bize istenen sayinin bulundugu indexi verir.


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));

        // Eger olmayan bir elementi aratirsak Java bulamadigini gostermek icin - isareti koyar. Sonrada o sayi olsaydi
        // siralamasi ne olurdu ise o sayiyi bize verir.


    }
}
