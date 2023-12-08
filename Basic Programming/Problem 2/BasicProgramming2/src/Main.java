import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistem Grading Mahasiswa");
        System.out.println("========================");
        Scanner input = new Scanner(System.in);
        System.out.println("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.println("Nilai : ");
        int nilai = input.nextInt();

        String grading = " ";

        if(nilai >= 80 && nilai <=100){
            grading = "A";
        } else if (nilai >= 65 && nilai <= 79) {
            grading = "B+";
        } else if (nilai >= 50 && nilai <= 64) {
            grading = "B";
        } else if (nilai >= 35 && nilai <= 49) {
            grading = "C";
        } else if (nilai == 0 && nilai <=34) {
            grading = "D";
        } else {
            grading = "Invalid";
        }

        System.out.println("Hasil grading dari "+nama+" "+"adalah "+grading);

    }
}