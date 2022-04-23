package day23_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {
        List<Integer> sayilarList=new ArrayList<>();

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        sayilarList.add(2,7);
        System.out.println(sayilarList);

        System.out.println(sayilarList.get(2));
        //o sayiyi bize getirdi ama hala orada duruyor, oradan sokulmedi
        System.out.println(sayilarList);



    }
}
