package pertemuan7.latihan2;
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk nilai n
        System.out.print("Masukkan nilai n (<= 10): ");
        int n = scanner.nextInt();

        // Validasi input, pastikan n <= 10
        if (n > 10) {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
            return; // Keluar dari program jika input tidak valid
        }

        // Menampilkan header tabel
        System.out.print("\t"); // Menambahkan spasi tab di depan agar header lebih rapi
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t"); // Menampilkan angka kolom
        }
        System.out.println(); // Pindah ke baris baru setelah header

        // Menampilkan baris tabel dengan perkalian
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t"); // Menampilkan angka baris
            for (int j = 1; j <= n; j++) {
                // Menampilkan hasil perkalian
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Pindah baris setelah setiap baris tabel
        }
    }
}
