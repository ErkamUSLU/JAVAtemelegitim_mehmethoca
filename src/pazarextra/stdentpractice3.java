package pazarextra;

import java.util.Scanner;

public class stdentpractice3 {

    public static void main(String[] args) {
        /*
 Username is "admin", Password is "pwd123" // kullanıcı adı "admin", Şifre "pwd123"
 Ask user to enter username and password //kullanıcıdan bilgilerini isteyin (şifre ve nickname)
 User should see "Enter your username and password" message // kullanıcı bunu görmeli)
 If she enters correct credentials he should get "You are in your account!" message //eğer doğru girerse hesabınızdasınız desin
 Otherwise, she should see "Enter your username and password" message 3 times //değilse, 3 kere doğru girme hakkı olsun)
 After 3 times he should get "Your account is blocked" message //3 kere yapamazsa hesabınız kilitlendi desin)
*/


        Scanner scan = new Scanner(System.in);
        int hataliGiris = 0;

        do {
            System.out.println("Kullanıcı adı gir");
            String username = scan.next();
            System.out.println("şifre gir");
            String password = scan.next();
            if (password.equals("pwd123") && username.equals("admin")) {
                System.out.println("Bilgileriniz Doğrudur\n" + "------HOŞGELDİNİZ-------");
                break;
            } else {
                System.out.println("Bilgilerinizi yanlış girdiniz, tekrar deneyiniz");
                hataliGiris++;
                System.out.println("kalan hak : " + (3 - hataliGiris));
            }
            if (hataliGiris == 3) {
                System.out.println("Yanlış Giriş Sınırına Ulaştınız, Hesabınız Bloke edildi!");
            }

        } while (hataliGiris < 3);

    }
}




