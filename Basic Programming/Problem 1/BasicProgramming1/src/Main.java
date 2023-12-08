import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Penghitung Luas Segitiga");
        System.out.println("===================================");
        System.out.println("Input Alas : ");
        float alas = input.nextFloat();
        System.out.println("Input Tinggi : ");
        float tinggi = input.nextFloat();

        float luas = (alas * tinggi)/2 ;
        System.out.println("Hasil Luas Segitiga = " +luas);
    }
}