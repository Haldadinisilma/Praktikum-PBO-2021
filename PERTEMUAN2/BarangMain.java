package tugaspraktikum;

public class BarangMain {

    public static void main(String[] args) {
        Barang br = new Barang();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("    P E N J U A L A N  B A R A N G     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        br.kode = "B321";
        br.namaBarang = "Tas Tory Burch";
        br.hargaDasar = 2900000;
        br.diskon = 0.25f;
        br.tampilData();
    }
}
