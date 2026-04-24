import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10; // son basamağı al
            sayi /= 10;          // sayıyı küçült
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
