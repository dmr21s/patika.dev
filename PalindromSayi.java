import java.util.Scanner;

public class PalindromSayi {


static boolean isPalindrom(int number) {
    int original = number;
    int reversed = 0;

    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }

    return original == reversed;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();

    if (isPalindrom(sayi)) {
        System.out.println("Palindrom sayıdır");
    } else {
        System.out.println("Palindrom sayı değildir");
    }
}


}
