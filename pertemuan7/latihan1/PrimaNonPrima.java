package pertemuan7.latihan1;

public class PrimaNonPrima {

    public static void main(String[] args) {
        // Variabel untuk menyimpan bilangan prima dan bukan prima
        String prima = "";
        String nonPrima = "";

        // Looping untuk memeriksa bilangan dari 0 hingga 20
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                prima += i + " ";  // Menambahkan bilangan prima ke variabel string
            } else {
                nonPrima += i + " "; // Menambahkan bilangan bukan prima ke variabel string
            }
        }

        // Menampilkan hasil bilangan prima dan bukan prima
        System.out.println("Bilangan Prima dari 0 - 20 Adalah:");
        System.out.println(prima);

        System.out.println("\nYang Bukan Bilangan Prima dari 0 - 20 Adalah:");
        System.out.println(nonPrima);
    }

    // Fungsi untuk mengecek apakah bilangan prima
    private static boolean isPrime(int num) {
        // Bilangan kurang dari 2 bukan prima
        if (num < 2) return false;

        // Looping dari 2 hingga num-1 untuk mengecek apakah ada pembagi selain dirinya sendiri
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;  // Jika ada pembagi selain 1 dan num, bukan prima
            }
        }
        return true; // Jika tidak ada pembagi, maka bilangan tersebut prima
    }
}


