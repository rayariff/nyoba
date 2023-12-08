public class Tabung {
    int jari;
    int tinggi;

    public Tabung(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double volumeTabung(){
        double volume = 3.14 * (jari * jari) * tinggi;
        return volume;
    }
}