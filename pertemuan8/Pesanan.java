package pertemuan8;

public class Pesanan {
    private Produk produk;
    private int jumlahBeli;

    public Pesanan(Produk produk, int jumlahBeli) {
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
    }

    public int hitungJumlahBayar() {
        return produk.getHarga() * jumlahBeli;
    }

    // getter methods
    public Produk getProduk() {
        return produk;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }
}
