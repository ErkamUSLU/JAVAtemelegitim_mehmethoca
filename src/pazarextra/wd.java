package pazarextra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wd {
    public static void main(String[] args) {
        //bu string icinde yinelenen karakterleri donduren bir kod yaziniz

        //str="javaisalsoeasy"  output= a  s
        String str = "Javaisalsoeasy";
        String arr [] = str.split("");
        String aranan="a";
        String aranan1="s";
        String str1="";




        for (int i = 0; i < arr.length; i++) {




            if(arr[i].equals(aranan)){
               str1=arr[i];}

            if(arr[i].equals(aranan1)){
                str1=str1.concat(" "+arr[i]);}

        }
        System.out.println(str1);



    }
}
