import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();
        if (palindrome(kata)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }
    }
    static boolean palindrome(String kata) {

        kata = kata.toLowerCase();

        char[] karakterArray = kata.toCharArray();

        int awal = 0;
        int akhir = karakterArray.length - 1;

        while (awal < akhir) {
            if (karakterArray[awal] != karakterArray[akhir]) {
                return false;
            }
            awal++;
            akhir--;
        }

        return true;
    }
}