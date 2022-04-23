package day08_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //Verilen sayıların pozitif mi negatif mi oldugunu kontrol edip 0 veya pozitif sayı ise tek veya cift;
        //negatif sayı ise -100'den buyuk veya kucuk oldugunu belirleyen bir ternary yazınız.


        int sayı=20;

        if (sayı>=0){
            if (sayı%2==0){System.out.println("sayı pozitif cift sayı");}
            else{System.out.println("sayı pozitif tek sayı");}}
        else{
            if (sayı<=-100){System.out.println("sayı -100'den kucuk negatif sayı");}
            else{System.out.println("sayı -100'den buyuk negatif tek sayı");}}

        sayı=-9952;

        String sonuc=sayı>=0 ?
                (sayı%2==0 ? "0 veya pozitif cift sayı" : "pozitif tek sayı") :
                (sayı<=-100? "-100'den kucuk negatif sayı" : "-100'den buyuk negatif tamsayı" );
        System.out.println(sonuc);


    }
}
