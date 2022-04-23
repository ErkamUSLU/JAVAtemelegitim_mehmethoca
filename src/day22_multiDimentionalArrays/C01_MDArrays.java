package day22_multiDimentionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

        //ilk inner array' in tum elementlerini yazdirin.
        System.out.println(arr[0]);//bu referans;  arr[0] bir array oldugu icin direct yazdirilamaz
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]
        System.out.println(Arrays.toString(arr));// bu referans; bu pcden pcye degisir.


        //MD Array' de tum elementleri yazdirmak icin;
        System.out.println(Arrays.deepToString(arr));









    }
}
