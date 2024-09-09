package pertemuan2.latihan2;

public class BingoBeraksi {
     public static void main(String[] args) {
          Bingo bingo = new Bingo(); // membuat objek dari kelas Bingo, memanggil konstruktor Bingo
          bingo.printClapLyrics(0); // memanggil metode pintclaplyrics() dengan 'clapcount' = 0, menampilkan lirik tanpa 'clap'

          // loop dari 1 hingga 5 untuk menampilkan variasi tepukan 'clap' pada lirik
          for (int i = 1; i <= 5; i++) { // loop dimulai dari 1-5, mengontrol jumlah tepukan
               bingo.printClapLyrics(i); // memanggil printclaplyrics dengan jumlah 'clap' sesuai iterasi loop
          }
     }
}