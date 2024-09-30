package pertemuan5;
import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Total pembelian Rp.: ");
        double totalPembelian = scanner.nextDouble();

        // Variabel untuk menyimpan potongan dan jumlah yang harus dibayarkan
        double potongan;
        double jumlahBayar;

        // Tentukan potongan sesuai dengan kriteria
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; // 5% potongan
        } else {
            potongan = totalPembelian * 0.20; // 20% potongan
        }

        // Hitung jumlah yang harus dibayarkan
        jumlahBayar = totalPembelian - potongan;

        System.out.printf("Besarnya potongan Rp. %.2f\n", potongan);
        System.out.printf("Jumlah yang harus dibayarkan Rp. %.2f\n", jumlahBayar);

        scanner.close();
    }
}
