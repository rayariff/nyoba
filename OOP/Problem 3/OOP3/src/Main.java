import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KALKULATOR SEDERHANA");
        System.out.println("====================");
        System.out.println("");

        System.out.println("===============");
        System.out.println("= Penjumlahan =");
        System.out.println("===============");
        Penjumlahan jumlah = new Penjumlahan();
        System.out.print("Angka pertama penjumlahan = ");
        int jumlahA = input.nextInt();
        System.out.print("Angka kedua penjumlahan = ");
        int jumlahB = input.nextInt();
        jumlah.setAngka1(jumlahA);
        jumlah.setAngka2(jumlahB);
        System.out.println("Hasil penjumlahan = "+jumlah.hasilJumlah());

        System.out.println("===============");
        System.out.println("= Pengurangan =");
        System.out.println("===============");
        Pengurangan kurang = new Pengurangan();
        System.out.print("Angka pertama pengurangan = ");
        int kurangA = input.nextInt();
        System.out.print("Angka kedua penjumlahan = ");
        int kurangB = input.nextInt();
        kurang.setAngka1(kurangA);
        kurang.setAngka2(kurangB);
        System.out.println("Hasil pengurangan = "+kurang.hasilKurang());

        System.out.println("=============");
        System.out.println("= Perkalian =");
        System.out.println("=============");
        System.out.print("Angka pertama perkalian = ");
        int kaliA = input.nextInt();
        System.out.print("Angka kedua perkalian = ");
        int kaliB = input.nextInt();
        Perkalian kali = new Perkalian();
        kali.setAngka1(kaliA);
        kali.setAngka2(kaliB);
        System.out.println("Hasil perkalian = "+kali.hasilKali());

        System.out.println("=============");
        System.out.println("= Pembagian =");
        System.out.println("=============");
        System.out.print("Angka pertama pembagian = ");
        int bagiA = input.nextInt();
        System.out.print("Angka kedua pembagian = ");
        int bagiB = input.nextInt();
        Pembagian bagi = new Pembagian();
        bagi.setAngka1(bagiA);
        bagi.setAngka2(bagiB);
        System.out.println("Hasil pembagian = "+bagi.hasilBagi());
    }
}