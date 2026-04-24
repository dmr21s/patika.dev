import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = input.nextInt();

        boolean artikMi;

        // Artık yıl kuralı
        artikMi = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0);

        if (artikMi) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
