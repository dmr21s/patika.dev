import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Yarıçapı girin: ");
        double r = input.nextDouble();

        // Alan ve çevre
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire dilimi
        System.out.print("Merkez açıyı girin (derece): ");
        double aci = input.nextDouble();

        double dilimAlan = (pi * r * r * aci) / 360;

        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }
}
