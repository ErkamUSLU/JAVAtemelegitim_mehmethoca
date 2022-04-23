package day11_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik.";
        // bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi : " +  str.replace(" " , "").length());

        // Atama yapilmadigi surece orjinal String kalici olarak degismez. Sadece o satir icin degisiklik yapilip sonuc
        // yazdirilmis olur.
        System.out.println("orjinal str karakter sayisi : "+ str.length());


        // str da kalici degisiklik yapalim. Bugun yerine yarin; ogrendik yerine ogrenecegiz
        str=str.replace("Bugun","Yarin");
        str=str.replace("ogrendik.","ogrenecegiz.");
        System.out.println("Kalici degisiklikten sonra : " + str);


        str.replace("ne cok", "ne az");//Degisiklik kalıcı degil.
        System.out.println(str);
    }
}
