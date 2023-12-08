public class Kubus {
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int volumeKubus(){
        int volume = sisi * sisi * sisi;
        return volume;
    }
}