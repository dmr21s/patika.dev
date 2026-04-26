import java.util.Scanner;

public class RecursiveDesen {


static void desen(int n, int temp, boolean azaliyor) {
    System.out.print(temp + " ");

    if (temp <= 0)
        azaliyor = false;

    if (temp == n && !azaliyor)
        return;

    if (azaliyor)
        desen(n, temp - 5, true);
    else
        desen(n, temp + 5, false);
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("N Sayısı : ");
    int n = input.nextInt();

    desen(n, n, true);
}


}
