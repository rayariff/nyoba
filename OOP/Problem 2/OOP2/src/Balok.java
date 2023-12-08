public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volumeBalok(){
        int volume = panjang * lebar * tinggi;
        return volume;
    }
}