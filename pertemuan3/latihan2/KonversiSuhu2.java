package pertemuan3.latihan2;

public class KonversiSuhu2 extends KonversiSuhu {
    
    // method untuk mengonversi Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4/9;  // fahrenheit ke reamur
    }
}
