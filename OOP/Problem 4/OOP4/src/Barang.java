public class Barang {
    int panjang;
    int lebar;
    int tinggi;
    int berat;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int hitungVolume(){
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    public int hargaVolume(){
        int hargaVol = hitungVolume() * 100;
        return hargaVol;
    }

    public int hargaBerat(){
        int hargaBer = berat * 5000;
        return hargaBer;
    }
}