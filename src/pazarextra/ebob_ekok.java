package pazarextra;

public class ebob_ekok {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;
        int ebob=1;
        int ekok;


        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.println(n1 +" ve "+ n2 + "sayilarinin ebob'u "+ ebob);
        System.out.println(n1 +" ve "+ n2 + "sayilarinin ekok'u "+ ekok);

    }
}
