package pertemuan7.latihan1;

public class GanjilGenap {

    public static void main(String[] args) {
        // Variabel untuk menyimpan bilangan ganjil dan genap
        String ganjil = " ";
        String genap = " ";

        // Looping dari 0 hingga 20
        for (int i = 0; i <= 20; i++) {
            // Memeriksa apakah bilangan genap atau ganjil
            if (isEven(i)) {
                genap += i + " ";  // Menambahkan bilangan genap ke variabel
            } else {
                ganjil += i + " "; // Menambahkan bilangan ganjil ke variabel
            }
        }

        // Menampilkan hasil bilangan genap dan ganjil
        System.out.println("Bilangan Genap Dsri 0 - 20 Adalah");
        System.out.println(genap);

        System.out.println("\nBilangan Ganjil Dari 0 - 20 Adalah");
        System.out.println(ganjil);
    }

    // Fungsi untuk memeriksa apakah bilangan genap
    private static boolean isEven(int num) {
        return num % 2 == 0;  // Bilangan genap jika sisa bagi dengan 2 adalah 0
    }
}