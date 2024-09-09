package pertemuan2.latihan2;

public class Bingo {
     // deklarasi variabel instance 'lyrics' yang merupakan array string
     private String[] lyrics;

     // konstruktor Bingo, yang akan dijalankan saat objek Bingo dibuat
     public Bingo() {
          // inisiasi array 'lyrics' dengan lirik lagu Bingo
          lyrics = new String[] {
               "There was a farmer who had a dog,", // baris pertama lirik
               "And Bingo was his name-o." // baris kedua lirik
          };
     }

     // metode untuk mencetak lirik dengan variabel 'clap'
     public void printClapLyrics(int clapCount) { // 'clapcount' menentukan berapa banyak karakter 'Bingo' yang akan diganti dengan 'clap'
          // loop untuk mencetak setiap baris dalam array 'lyrics'
          for (String line : lyrics) {
               System.out.println(line); // mencetak setiap baris lirik
          }

          // loop untuk mencetak variasi 'clip' atau huruf dari kata 'Bingo'
          for (int k = 0; k < 5; k++) { // loop 5 kali di setiap karakter 'Bingo'
               if (k < clapCount) { // jika k lebih kecil dari 'clapcount', cetak 'clap'
                    System.out.print("(clap)");
               } else { // jika tidak, cetak huruf dari kata 'Bingo'
                    System.out.print("BINGO".charAt(k)); // mencetak huruf berdasarkan indeks k
               }
               if (k < 4) {
                    System.out.print("-"); // menambahkan tanda '-' antara huruf atau 'clap'
               }
          }

          System.out.println();
          System.out.println("And Bingo was his name-o."); // mencetak ulang baris terakhir lirik
          System.out.println();
     }
}