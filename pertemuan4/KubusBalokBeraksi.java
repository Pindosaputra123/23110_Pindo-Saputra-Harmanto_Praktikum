package pertemuan4;

public class KubusBalokBeraksi {
    public static void main(String[] args) {
        // mmebuat Balok tertentu dengan panjang, lebar, tinggi, tertentu
        Balok balok = new Balok(5, 3, 4);
        System.out.println("Balok : ");
        System.out.println("Volume Balok : " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());

        // membuat Kubus tertentu dengan sisi
        Kubus kubus = new Kubus(4);
        System.out.println("\nKubus : ");
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
    }
}
