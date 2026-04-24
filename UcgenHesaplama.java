import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Dik üçgen için kenarlar
        System.out.print("1. dik kenarı girin: ");
        double a = input.nextDouble();

        System.out.print("2. dik kenarı girin: ");
        double b = input.nextDouble();

        // Hipotenüs (Pisagor)
        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        // Alan için 3 kenar
        System.out.print("1. kenar: ");
        double k1 = input.nextDouble();

        System.out.print("2. kenar: ");
        double k2 = input.nextDouble();

        System.out.print("3. kenar: ");
        double k3 = input.nextDouble();

        // Yarı çevre
        double u = (k1 + k2 + k3) / 2;

        // Heron formülü
        double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
