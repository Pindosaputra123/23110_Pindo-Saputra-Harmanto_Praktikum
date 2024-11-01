/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMahasiswa;
import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;

    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList();
    }

    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, float nilai1, float nilai2, float nilai3, float nilai4, float nilai5, float nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir);
        listmahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }

    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
