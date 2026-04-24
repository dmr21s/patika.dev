import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi km cinsinden girin: ");
        double km = input.nextDouble();

        double acilis = 10;
        double kmBasi = 2.20;

        double tutar = acilis + (km * kmBasi);

        // Minimum ücret kontrolü (ternary)
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
