package pertemuan3.latihan1;

// mengimpor class Matematika dari pertemuan2 latihan1
import pertemuan2.latihan1.Matematika;

// deklarasi class Matematika2 yang mewarisi class Matematika dari package yang diimpor
public class Matematika2 extends Matematika{
    // method modulus (sisa bagi)
    public int modulus (int a, int b) {
        // mengembalikan hasil operasi modulus
        return a % b;
    }
}
