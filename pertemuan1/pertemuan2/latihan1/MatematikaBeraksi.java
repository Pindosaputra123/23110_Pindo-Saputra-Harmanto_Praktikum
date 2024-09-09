package pertemuan2.latihan1;

public class MatematikaBeraksi {
     public static void main(String[] args) {
          // membuat objek dari kelas Matematika
          Matematika math = new Matematika();

          // memanggil metode pertambahan dari objek 'math' dan menyimpan hasilnya
          int hasilPertambahan = math.pertambahan(20, 10);
          // menampilkan hadil dari operasi pertambahan
          System.out.println("Pertambahan 20 + 10 = " + hasilPertambahan);

          // memanggil metode pengurangan dari objek 'math' dan menyimpan hasilnya
          int hasilPengurangan = math.pengurangan(10, 15);
          // menampilkan hasil dari operasi pengurangan
          System.out.println("Pengurangan 10 - 15 = " + hasilPengurangan);

          // memanggil metode perkalian dari objek 'math' dan menyimpan hasilnya
          int hasilPerkalian = math.perkalian(10, 3);
          // menampilkan hasil dari operasi perkalian
          System.out.println("Perkalian 10 * 3 = " + hasilPerkalian);

          // memanggil metode pembagian dari objek 'math' dan menyimpan hasilnya
          int hasilPembagian = math.pembagian(21, 2);
          // menampilkan hasil dari operasi pembagian
          System.out.println("Pembagian 21 / 2 = " + hasilPembagian);
     }
}
