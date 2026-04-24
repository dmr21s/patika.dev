import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }

        if (sayac > 0) {
            double ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Uygun sayı yok.");
        }
    }
}
