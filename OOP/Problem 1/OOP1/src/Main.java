import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Penghitung Luas dan Keliling Bangun Datar");
        System.out.println("=========================================");
        System.out.println("Masukan sisi persegi : ");
        int sisi = input.nextInt();
        System.out.println("Masukan alas segitiga : ");
        int alas = input.nextInt();
        System.out.println("Masukan tinggi segitiga : ");
        int tinggi = input.nextInt();
        System.out.println("Masukan panjang persegi panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukan lebar persegi panjang : ");
        int lebar = input.nextInt();

        Persegi persegi1 = new Persegi(+sisi);
        Segitiga segitiga1 = new Segitiga(+tinggi, +alas);
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(+panjang, +lebar);

        System.out.println("Luas Persegi adalah "+persegi1.luasPersegi());
        System.out.println("Luas Segitiga adalah "+segitiga1.luasSegitiga());
        System.out.println("Luas Persegi Panjang adalah "+persegiPanjang1.luasPersegiPanjang());
        System.out.println("");
        System.out.println("Keliling Persegi adalah "+persegi1.kelilingPersegi());
        System.out.println("Keliling Segitiga adalah "+segitiga1.kelilingSegitiga());
        System.out.println("Keliling Persegi Panjang adalah "+persegiPanjang1.kelilingPersegiPanjang());

    }
}