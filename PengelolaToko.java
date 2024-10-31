package pertemuan8;
import java.util.Scanner;

public class PengelolaToko {
    private Produk[] daftarProduk;

    public PengelolaToko() {
        daftarProduk = new Produk[] {
            new Produk("a001", "Buku", 3000),
            new Produk("a002", "Pensil", 4000),
            new Produk("a003", "Pulpen", 5000),
            new Produk("a004", "Penggaris", 6000),
            new Produk("a005", "Penghapus", 2000),
            new Produk("a006", "Spidol", 8000),
            new Produk("a007", "Stiker", 1500),
            new Produk("a008", "Buku Gambar", 10000)
        };
    }

    public Produk cariProduk(String kode) {
        for (Produk produk : daftarProduk) {
            if (produk.getKode().equalsIgnoreCase(kode)) {
                return produk;
            }
        }
        return null; // produk tidak ditemukan
    }

    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Produk : ");
        int jumlahItem = input.nextInt();
        input.nextLine(); // konsumsi newline

        Pesanan[] pesananList = new Pesanan[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data Ke " + (i + 1));
            System.out.print("Masukkan Kode Produk : ");
            String kode = input.nextLine();
            System.out.print("Masukkan Jumlah Beli : ");
            int jumlahBeli = input.nextInt();
            input.nextLine(); // konsumsi newline

            Produk produk = cariProduk(kode);
            if (produk != null) {
                pesananList[i] = new Pesanan(produk, jumlahBeli);
            } else {
                System.out.println("Produk Dengan Kode " + kode + " Tidak Ditemukan");
            }
        }

        cetakPesanan(pesananList);
    }

    public void cetakPesanan(Pesanan[] pesananList) {
        int totalBayar = 0;
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("********************************");
        System.out.println("No  Kode Produk  Nama Produk  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        for (int i = 0; i < pesananList.length; i++) {
            Pesanan pesanan = pesananList[i];
            if (pesanan != null) {
                Produk produk = pesanan.getProduk();
                int jumlahBayar = pesanan.hitungJumlahBayar();
                totalBayar += jumlahBayar;

                System.out.printf("%d   %s        %s        %d      %d          %d\n",
                    (i + 1), produk.getKode(), produk.getNama(), produk.getHarga(),
                    pesanan.getJumlahBeli(), jumlahBayar);
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar                             " + totalBayar);
    }

    public static void main(String[] args) {
        PengelolaToko toko = new PengelolaToko();
        toko.jalankan();
    }
}
