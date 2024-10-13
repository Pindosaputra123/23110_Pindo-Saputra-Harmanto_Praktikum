package pertemuan7.latihan1;

public class LaguAnakAyam {
    public static void main(String[] args) {
        // inisiasi jumlah anak ayam
        int anakAyam = 4;

        // menampilkan bagian pertama lagu
        System.out.println("\nTek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");

        // perulangan untuk menampilkan jumlah anak ayam yang turun dan mengurangi jumlahnya satu per satu
        while (anakAyam > 2) {
            System.out.println("Anak ayam turunlah " + anakAyam); // menampilkan jumlah anak ayam yang turun
            anakAyam--; // mengurangi jumlah anak ayam
            // jika masih ada anak ayam yang tersisa
            if (anakAyam >= 2) {
                System.out.println("Mati satu tinggallah " + anakAyam); // menampilkan anak ayam yang tersisa
            } else {
                // jika tidak ada anak ayam yang, hanya induknya yang tersisa
                System.out.println("Mati satu tinggallah induknya");
            }
        }

        // menampilkan bagian kedua lagu
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");

        // perulangan untuk menampilkan dua anak ayam terakhir yang turun
        while (anakAyam > 0) {
            System.out.println("Anak ayam turunlah " + anakAyam); // menampilkan anak ayam yang turun
            anakAyam--; // mengurangi jumlah anak ayam
            // jika masih ada anak ayam yang tersisa
            if (anakAyam > 0) {
                System.out.println("Mati satu tinggallah " + anakAyam); // menampilkan anak ayam yang tersisa
            } else {
                // jika tidak ada anak ayam yang tersisa, hanya induknya yang tersisa
                System.out.println("Mati satu tinggal induknya");
            }
        }
        
        // menampilkan bagian terakhir lagu
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turun berkotek\n");
    }
}
