package pazarextra;

import java.util.Arrays;

public class sena_hanim_soru {
    public static void main(String[] args) {
        int[] arr = {1,26,57,4,17,92,4,87};
        int kaldirilacakDeger = 26;
        arr = elemanKaldir(arr, kaldirilacakDeger);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] elemanKaldir ( int[] arr, int kaldirilacakDeger){
        int sayac=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==kaldirilacakDeger){
                sayac++;//kac sayi silecegimize baktik
            }
        }
        int[] yeniArr = new int[arr.length-sayac];//7 0'li bir array olustu
        for (int i = 0,x=0; i < arr.length-sayac && x<arr.length; i++, x++) {
            if (arr[x]==kaldirilacakDeger){
                x++;
            }
            yeniArr[i] = arr[x];
        }
        return yeniArr;
    }
}
