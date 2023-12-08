import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        float mean = hasilMean(array);

        System.out.println("Mean dari array tersebut adalah: " + mean);

        scanner.close();
    }
    public static float hasilMean(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (float) sum / array.length;
    }
}