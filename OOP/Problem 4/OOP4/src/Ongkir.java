public class Ongkir extends Barang{
    public int hargaOngkir(){
        int harga = hargaVolume() + hargaBerat();
        return harga;
    }
}