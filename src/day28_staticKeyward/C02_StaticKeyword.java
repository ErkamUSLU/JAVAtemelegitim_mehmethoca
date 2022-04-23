package day28_staticKeyward;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        //baska class'daki static uyelerine ulasabilmek icin sadece clasIsmi.staticUyeIsmi yazmamiz yeterlidir.

        System.out.println(C01_Static.okulTelefonu);//6456546

        C01_Static.okulTelefonu="45435534";

        System.out.println(C01_Static.okulTelefonu);//45435534

        //Baska class'taki static olmayan class uyelerine ancak o class'tan uye olusturarak ulasabiliriz. ve obje ile yaoilan
        //atamalar sadece o obje icin gecerli olur.

        C01_Static obj1= new C01_Static();
        C01_Static obj2= new C01_Static();

        System.out.println(obj2.okulIsmi);//Yildiz Koleji
        obj2.okulIsmi="Sabir Koleji";
        System.out.println(obj1.okulIsmi);//Yildiz Koleji


    }
}
