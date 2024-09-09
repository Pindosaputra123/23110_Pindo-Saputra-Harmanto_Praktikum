package pertemuan2.latihan1;

public class Matematika implements MatematikaInterface{ // kelas Matematika mengimplementasikan interface NatematikaInterface

     // metode untuk melakukan operasi pengurangan
     public int pertambahan(int a, int b) {
          return a + b; // mengembalikan hasil penjumlahan a dan b
     }

     // metode untuk melakukan operasi pengurangan
     public int pengurangan(int a, int b) {
          return a - b; // mengembalikan hasil pengurangan a dan b
     }

     // metode untuk melakukan operasi perkalian
     public int perkalian(int a, int b) {
          return a * b; // mengembalikan hasil perkalian a dan b
     }

     // metode untuk melakukan operasi pembagian
     public int pembagian(int a, int b) {
          if (b != 0) {  // memastikan bahwa pembagi b tidak 0
               return a / b; // jika b bukan 0, mengembalikan hasil pembagian a dan b
          } else { // jika b adalah 0, menampilkan pesan error
               System.out.println("Error : Pembagian dengan no!");
               return 0; // mengembalikan nilai 0 sebagai penanda pembagian tidak valid
          }
     }
}
