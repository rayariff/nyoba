public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang(){
        int luas = this.panjang * this.lebar;
        return luas;
    }

    public int kelilingPersegiPanjang(){
        int keliling = (this.panjang * 2) + (this.lebar * 2);
        return keliling;
    }
}