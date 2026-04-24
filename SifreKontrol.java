import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String dogruSifre = "12345";

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = input.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.print("Şifre yanlış. Sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifre giriniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}
