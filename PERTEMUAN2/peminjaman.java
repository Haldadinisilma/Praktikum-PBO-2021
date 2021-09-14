package tugaspraktikum;

public class peminjaman {

    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void tampilDataPeminjaman() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
    }

    public void hargaBayar(int lamaSewa) {
        int totalBayar = lamaSewa * harga;
        System.out.println("Harga yang harus dibayarkan  : Rp " + totalBayar);
    }
}
