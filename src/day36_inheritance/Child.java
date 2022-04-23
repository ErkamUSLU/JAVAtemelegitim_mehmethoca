package day36_inheritance;

public class Child extends Parent{



    Child() {
       super();
        System.out.println("Child Constructor calisti.");
    }





   //Tum class'larda biz gormesek bile Java'nin olusturdugu default Constructor vardir.
   //Exrends keyword kullanan class'lardaki tum Constructor'larin ilk satirinda biz gormesek bile
    //super() Constructor call vardir.
   //Yani parent class'in parametresiz Constructor call

    public static void main(String[] args) {
        Child child = new Child();
    }
}