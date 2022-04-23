package day19_scope_Arrays;

public class C01_ScopeInstance {

    int sayi;
    String bransIsmi="Java";
    boolean okulDaMi;


    public static void main(String[] args) {



        //sayi=10; sayi variable`i static olmadigi icin main method`dan direkt kullanilamaz.
        //instance variable`lara static method`lardan ulasabilmek icin obje olusturmamiz gerekir.

        C01_ScopeInstance obj1=new C01_ScopeInstance();
        System.out.println(obj1.sayi);//0
        obj1.sayi=656;
        System.out.println(obj1.sayi);//656
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okulDaMi);


        C01_ScopeInstance obj2=new C01_ScopeInstance();
        System.out.println(obj2.sayi);//default yani 0
        System.out.println(obj2.bransIsmi);//Java


        obj1.okulDaMi=true;
        System.out.println(obj2.okulDaMi);



    }
}
