import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int tip = input.nextInt();

        // Hatalı giriş kontrolü
        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {

            double normalTutar = mesafe * 0.10;
            double indirimliTutar = normalTutar;

            // Yaş indirimi
            if (yas < 12) {
                indirimliTutar *= 0.5;
            } else if (yas <= 24) {
                indirimliTutar *= 0.9;
            } else if (yas > 65) {
                indirimliTutar *= 0.7;
            }

            // Gidiş-dönüş indirimi
            if (tip == 2) {
                indirimliTutar *= 0.8;
                indirimliTutar *= 2; // gidiş-dönüş olduğu için 2 ile çarpılır
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
        }
    }
}
