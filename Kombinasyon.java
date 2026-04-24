import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int nF = 1, rF = 1, nrF = 1;

        // n!
        for (int i = 1; i <= n; i++) {
            nF *= i;
        }

        // r!
        for (int i = 1; i <= r; i++) {
            rF *= i;
        }

        // (n-r)!
        for (int i = 1; i <= (n - r); i++) {
            nrF *= i;
        }

        int kombinasyon = nF / (rF * nrF);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
