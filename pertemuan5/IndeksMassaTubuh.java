package pertemuan5;
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat badan dan tinggi badan
        System.out.print("Berat Badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Hitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Output nilai IMT
        System.out.printf("IMT Anda:" + imt + "\n");

        // Tentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output kriteria
        System.out.println("Kriteria: " + kriteria);

        scanner.close();
    }
}
