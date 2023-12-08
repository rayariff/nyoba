import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistem Menghitung Faktorial dari Bilangan");
        System.out.println("=========================================");
        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
        int n = scanner.nextInt();
        System.out.print("Faktorial dari " + n + " adalah: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}