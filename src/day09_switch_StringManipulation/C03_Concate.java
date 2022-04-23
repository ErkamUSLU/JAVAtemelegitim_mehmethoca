package day09_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        //Concatenation yapmak icin iki ihtimalimiz var
        //Istersek daha once yaptıgımız gibi + operatorunu kullanırız istersek String class


        String str1="Java";
        String str2="Candır";
        // Java Candır yazdıralım.


        System.out.println(str1 +" "+ str2);

        String cumle= str1.concat(str2);//JavaCandır

        cumle= str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //Concat icine String degilde boolean deger yazarsak
        //Concat method'u icine String parametre ister.
        //String dısında bir data turu yazdıgınızda onu String haline getirmelisiniz.

        //cumle=str1.concat(5);
        cumle=str1.concat(""+5);


    }
}
