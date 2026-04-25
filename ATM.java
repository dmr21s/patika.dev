import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma");
                    System.out.println("2-Para çekme");
                    System.out.println("3-Bakiye sorgula");
                    System.out.println("4-Çıkış yap");

                    System.out.print("Seçiminiz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int yatir = input.nextInt();
                            balance += yatir;
                            break;

                        case 2:
                            System.out.print("Para miktarı: ");
                            int cek = input.nextInt();
                            if (cek > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cek;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;

                        default:
                            System.out.println("Geçersiz seçim!");
                    }

                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
