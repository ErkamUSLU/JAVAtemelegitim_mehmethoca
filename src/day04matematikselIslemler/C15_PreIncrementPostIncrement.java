package day04matematikselIslemler;

public class C15_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        //bu sayiyi bir artirmak istersek
        sayi++;
        System.out.println(sayi);//11
        sayi++;
        System.out.println("pre-incrementten once: "+  sayi);//12
        //eger 11. ve 12. satirda yaptıgım iki islemi tek satırda yaparsam
        //java iki islemden hangisini önce yapacagını bilmek ister
        //once artırır sonra yazdırırsak java yeni degeri yazdırır
        //ama once yazdırır sonra artırırsak bu durumda eski deger yazdırılır


        System.out.println("pre-increment satırında: "+  ++sayi);//13 once artır sonra yazdır
        System.out.println("pre-incrementten sonra:  "+  sayi);//13


        System.out.println("post-increment satırında:   "+  sayi++);//13 once yazdır sonra artır
        System.out.println("post-increment satırında:  "+  sayi);//14

    }
}
