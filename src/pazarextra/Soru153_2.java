package pazarextra;

public class Soru153_2 {
    public static void main(String[] args) {
        //'m' harfinden baslayarak 'c' harfine kadar tum harfleri yazdırın.
        //char karakter;
       /* for(karakter= 'm'; karakter >= 'c'; --karakter)
            System.out.print(karakter+" ");*/
        char karakter='m'+1;
        do { karakter-=1;
            System.out.print(karakter+" ");
        }while (karakter>1+'c');

    }
}
