import java.util.Scanner;

public class Main {
    public static char karakter(int value) {
        if (value % 3 == 0) {
            return 'X';
        } else if (value % 2 == 1) {
            return 'Y';
        } else {
            return 'Z';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char ch = karakter(counter);
                System.out.print(ch + " ");
                counter++;
            }
            System.out.println();
        }
    }
}