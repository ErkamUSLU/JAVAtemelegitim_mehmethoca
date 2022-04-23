package day09_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {
        //Strting de herhangi bir karakteri almak istedigimizde o harfin indexini kullanarak str.charAt(istenenIndex)
        //yazabiliriz.

        String str= "Java Cok Guzel";


        //J'yi yazdıralım.

        System.out.println(str.charAt(0));

        //G'yi yazdıralım.

        System.out.println(str.charAt(9));

        //va yazdıralım.

        System.out.println(""+str.charAt(2)+str.charAt(3));
        //eger char'ları matematiksel isleme sokarsak ASCI degeri goruruz. Basa "" yaparak cozduk.

        //cOK seklınde yazdıralım.

        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        //Son harfi yazdırın.String'de 14 harf var; dolayısıyla son harfin indexi 14-1=13'dur.

        System.out.println(str.charAt(14-1));//uzunluk-1

        //Eger uzunlugu index olarak girersek: Java calıstıktan sonra hata verir.

        //System.out.println(str.charAt(14));






    }
}
