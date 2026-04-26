import java.util.Scanner;

public class RecursiveAsal {

```
static boolean isAsal(int n, int i) {
    if (n <= 2)
        return n == 2;
    if (n % i == 0)
        return false;
    if (i * i > n)
        return true;
    return isAsal(n, i + 1);
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Sayı Giriniz : ");
    int n = input.nextInt();

    if (isAsal(n, 2)) {
        System.out.println(n + " sayısı ASALDIR !");
    } else {
        System.out.println(n + " sayısı ASAL değildir !");
    }
}
```

}
