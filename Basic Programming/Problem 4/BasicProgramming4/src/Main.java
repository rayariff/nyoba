import java.util.Scanner;

public class Main {
    public static boolean prima(int angka){
        if(angka <= 1){
            return false;
        }

        int i = 2;
        while (i * i <= angka) {
            if (angka % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangan : ");
        int angka = input.nextInt();

        if(prima(angka)){
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
}