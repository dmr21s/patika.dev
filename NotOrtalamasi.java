import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        int toplam = 0, sayac = 0;

        System.out.print("Matematik notu: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            sayac++;
        }

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;
        }

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }

        if (sayac > 0) {
            double ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);

            String durum = (ortalama >= 55) ? "Geçti" : "Kaldı";
            System.out.println(durum);
        } else {
            System.out.println("Geçerli not girilmedi!");
        }
    }
}
