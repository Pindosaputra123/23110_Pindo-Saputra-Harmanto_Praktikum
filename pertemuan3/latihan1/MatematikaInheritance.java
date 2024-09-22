package pertemuan3.latihan1;

public class MatematikaInheritance {
    public static void main (String[] args) {
        // membuat objek dari class Matematika2
        Matematika2 mtk = new Matematika2();

        // memanggil method pertambahan yang diwarisi dari class Matematika dan menyimpan hasilnya dalam variabel hasilTambah
        int hasilTambah = mtk.pertambahan(7, 7);
        // memanggil method pengurangan yang diwarisi dari class Matematika dan menyimpan hasilnya dalam variabel hasilKurang
        int hasilKurang = mtk.pengurangan(20, 10);
        // Memanggil method perkalian yang diwarisi dari class Matematika dan menyimpan hasilnya dalam variabel hasilKali
        int hasilKali = mtk.perkalian(2, 5);
        // Memanggil method pembagian yang diwarisi dari class Matematika dan menyimpan hasilnya dalam variabel hasilBagi
        int hasilBagi = mtk.pembagian(10, 2);
        // Memanggil method modulus yang ada di class Matematika2 dan menyimpan hasilnya dalam variabel sisaBagi
        int sisaBagi = mtk.modulus(20, 5);

        // menampilkan hasil operasi petambahan, pengurangan, perkalian, pembagian, dan modulus
        System.out.println("Hasil Pertambahan Dari 7 + 7 = " + hasilTambah);
        System.out.println("Hasil Pengurangan Dari 20 - 10 = " + hasilKurang);
        System.out.println("Hasil Perkalian Dari 2 * 5 = " + hasilKali);
        System.out.println("Hasil Pembagian Dari 10 : 2 = " + hasilBagi);
        System.out.println("Hasil Sisa Bagi Dari 20 : 5 = " + sisaBagi);
    }
}
