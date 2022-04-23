package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        //Kullanıcıdan bir cumle ve kelıme isteyin; kelimenin cumledeki kullanımına bakarak assagıdaki 3 cumleden uygun
        //olanı yazdırın.-Girilen kelime cumlede kullanılmamıs.
        //               -Girilen kelime cumlede 1 kere kullanılmıs.
        //               -Girilen kelime cumlede bircok kere kullanılmıs.


        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac.";
        String kelime= "program ";//Anlamlı kelime olması zorunlulugu yok; rastgele birsey secebiliriz.

        int ilkkullanım=cumle.indexOf(kelime);//Ya -1 ya da index cıkar.
        int ikincikullanım=cumle.indexOf(kelime,ilkkullanım+1);


        if (ilkkullanım==(-1)){System.out.println("Girilen kelime cumlede kullanılmamıs.");}//-
        else if (ikincikullanım==(-1)){System.out.println("Girilen kelime cumlede bir kere kullanılmıs.");}//1
        else {System.out.println("Girilen kelime cumlede birden cok kere kullanılmıs.");}//+1
    }
}
