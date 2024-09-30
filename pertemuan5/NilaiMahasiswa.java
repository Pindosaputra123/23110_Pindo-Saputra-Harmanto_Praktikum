package pertemuan5;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        String grade;
        String keterangan;

        // menentukan grade dan keterangan
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        System.out.println("\nTampilan Output");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.printf("Nilai Rata-rata: %.2f\n", nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);

        scanner.close();
    }
}
