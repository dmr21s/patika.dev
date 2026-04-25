import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int sayi;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
