package DataMahasiswa;

public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private float nilai1, nilai2, nilai3, nilai4, nilai5, NilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, float nilai1, float nilai2, float nilai3, float nilai4, float nilai5, float NilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.NilaiAkhir = NilaiAkhir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }
    
    public String getMataKuliah() {
        return MataKuliah;
    }
    
    public float getNilai1(){
        return nilai1;
    }
    
    public float getNilai2(){
        return nilai2;
    }
    
    public float getNilai3(){
        return nilai3;
    }
    
    public float getNilai4(){
        return nilai4;   
    }
    
    public float getNilai5(){
        return nilai5;
    }
    
    public float getNilaiAkhir(){
        return NilaiAkhir;
    }
    
}
