package day29_passByValue;

public class C02_StaticBlocks {
     {

         /*static olmayan bloklar ise obje olusturulurken calisir. static bloklar sadecce 1 kere en basta calisir.*/
        System.out.println("erk");
    }

    public static void main(String[] args) {

        C02_StaticBlocks obj1= new C02_StaticBlocks();



    }
}
