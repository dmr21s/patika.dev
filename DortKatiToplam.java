import java.util.Scanner;

public class DortKatiToplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();

            // çift ve 4'ün katı kontrolü
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }

        } while (sayi % 2 == 0); // tek sayı girilene kadar devam

        System.out.println("Toplam: " + toplam);
    }
}
