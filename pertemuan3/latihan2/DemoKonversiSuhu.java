package pertemuan3.latihan2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        // nilai contoh dalam Celcius
        double celcius = 100;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheit);
        
        // menampilkan hasil konversi dari Celcius ke Fahrenheit dan Reamur
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Reamur: " + reamur);
        
        // menampilkan hasil konversi dari Fahrenheit ke Reamur
        System.out.println("Reamur dari Fahrenheit: " + reamurFromFahrenheit);
    }
}
