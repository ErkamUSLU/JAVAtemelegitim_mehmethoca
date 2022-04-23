package day05concatenation_Operators;

public class C22_MantıkOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9  && 6+3==9 && 5+2!=8;//T && T %% T %% T=true
        System.out.println(sonuc1);//true



        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;//T && F %% T %% T=false
        System.out.println(sonuc2);//false


        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;//T & F % T % T=false
        System.out.println(sonuc3);//false



        //&& ve & arasındaki fark;
        //&& da tek false gorunce durur
        //& da tek false gorunce durmaz


        //sayi3'un 10 ile 20 arasında true diyerek dondurelım
        //java 3lu karsılastırma kabul etmez
        //2li karsilastırmalar yapıp mantıksal operatorlerle birlestirmeliyiz
        int sayi3=15;
        System.out.println("10<sayi3<20= " + (10<sayi3  &&  sayi3<20));//true



        //sayi4'un 10 ile 20 arasında olmadıgını true diyerek dondurelim
        int sayi4=5;
        System.out.println(sayi4<10 || sayi4>20);//OR= true




        byte sayi56=56;
        int sayi57=sayi56;
        System.out.println(sayi57);
    }
}
