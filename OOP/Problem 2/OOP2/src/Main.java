import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Penghitung Volume Bangun Ruang");
        System.out.println("==============================");
        System.out.println("Masukan sisi kubus : ");
        int sisi = input.nextInt();
        System.out.println("Masukan panjang balok : ");
        int panjang = input.nextInt();
        System.out.println("Masukan lebar balok : ");
        int lebar = input.nextInt();
        System.out.println("Masukan tinggi balok : ");
        int tinggiBalok = input.nextInt();
        System.out.println("Masukan jari - jari tabung : ");
        int jari = input.nextInt();
        System.out.println("Masukan tinggi tabung : ");
        int tinggitabung = input.nextInt();

        Kubus kubus1 = new Kubus(+sisi);
        Balok balok1 = new Balok(+panjang, +lebar, +tinggiBalok);
        Tabung tabung1 = new Tabung(+jari, +tinggitabung);

        System.out.println("Volume Kubus adalah "+kubus1.volumeKubus());
        System.out.println("Volume Balok adalah "+balok1.volumeBalok());
        System.out.println("Volume Tabung adalah "+tabung1.volumeTabung());
    }
}