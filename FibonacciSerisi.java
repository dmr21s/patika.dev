import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int toplam = a + b;
            a = b;
            b = toplam;
        }
    }
}
