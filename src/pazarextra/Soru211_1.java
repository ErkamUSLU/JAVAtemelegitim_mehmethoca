package pazarextra;

import java.util.ArrayList;
import java.util.List;

public class Soru211_1 {
    public static void main(String[] args) {
        //Bir integer array olusturunuz. Ve bu arraydaki tum sayilarin carpimini For-Each loop ile bulunuz.
        int arr[] = {1, 3, 5};

        int carpim = 1;
        for (int each : arr
        ) {
            carpim *= each;
        }
        System.out.println(carpim);
    }
}
