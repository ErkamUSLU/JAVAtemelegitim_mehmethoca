package pazarextra;

import java.util.ArrayList;
import java.util.List;

public class Soru212_2 {
    public static void main(String[] args) {


    //Bir integer list olusturunuz ve bu list'deki tum sayilarin karesinin toplamini For-each loop kullanarak bulunuz.

    int arr[]={3,6};
    List<Integer>sayilar= new ArrayList<>();
        for (int each : arr ) {

            sayilar.add(each*each);
        }
        System.out.println(sayilar);








    }
}
