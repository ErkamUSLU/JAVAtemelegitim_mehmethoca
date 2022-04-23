package day06_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("Isteginiz gerceklesecek.");
            System.out.println("Body icindeki tum kodlar calısır.");
        }

        if (a > 0)
            System.out.println("suslu parantez olmazsa sadece bir satır calısır");

/*
bir if cumlesinin daha anlasılır olmasını istiyorsanız
if body'sini {} icine yazmalısınız
body'i {} icine yazmazsak da if cumlesi calısır
ancak ilk ; gordugunde if cumlesi bitmis olur
*/
            //24. satırdaki kod 14. satırdaki if dogru olsa da calısır false olsa da calısır
            System.out.println("2. satirda calıstı.");

    }

}

