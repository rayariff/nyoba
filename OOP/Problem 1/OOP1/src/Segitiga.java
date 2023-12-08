public class Segitiga {
    int tinggi;
    int alas;

    public Segitiga(int tinggi, int alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public float luasSegitiga(){
        float luas = this.alas * this.tinggi / 2;
        return luas;
    }

    public double kelilingSegitiga(){
        double sisimiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + sisimiring;
        return keliling;
    }
}