package pertemuan4;

// subclass dari BangunRuang untuk Balok
public class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    // konstruktor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    
    // implementasi metode hitungVolume untuk Balok
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // implementasi metode hitungLuasPermukaan untuk Balok
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
