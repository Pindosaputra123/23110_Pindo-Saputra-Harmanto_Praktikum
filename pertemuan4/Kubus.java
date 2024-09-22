package pertemuan4;

// subclass dari BangunRuang untuk Kubus
public class Kubus extends BangunRuang {
    private double sisi;

    // konstruktor untuk Kubus
    public Kubus (double sisi) {
        this.sisi = sisi;
    }

    // implementasi metode hitungVolume untuk Kubus
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // implementasi metode hitungLuasPermukaan untuk Kubus
    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
