package day15_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {
        //Verilen string'i tersten yazdıran bir kod yazınız.

        String str="Valla bu Java cok zevkli";

        for (int i = str.length()- 1; i >= 0; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }
}
