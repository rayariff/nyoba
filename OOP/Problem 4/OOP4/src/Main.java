import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Sistem Pengecekan Harga Ongkir");
        System.out.println("==================c============");

        System.out.print("Masukan panjang barang (cm) = ");
        int panjang = input.nextInt();
        System.out.print("Masukan lebar barang (cm) = ");
        int lebar = input.nextInt();
        System.out.print("Masukan tinggi barang (cm) = ");
        int tinggi = input.nextInt();
        System.out.print("Masukan berat barang (kg) = ");
        int berat = input.nextInt();

        Ongkir ongkir = new Ongkir();
        ongkir.setPanjang(+panjang);
        ongkir.setLebar(+lebar);
        ongkir.setTinggi(+tinggi);
        ongkir.setBerat(+berat);

        System.out.println("================================");
        System.out.println("Detail barang yang ingin dikirim");
        System.out.println("================================");
        System.out.println("Volume barang = "+ongkir.hitungVolume() + ", "+"Berat barang = "+berat);
        System.out.println("Jadi harga ongkir adalah "+ongkir.hargaOngkir());
    }
}