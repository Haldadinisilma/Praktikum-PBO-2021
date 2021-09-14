package tugaspraktikum;

public class peminjamanMain {

    public static void main(String[] args) {
        peminjaman pj = new peminjaman();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("        SEWA VIDEO GAME       ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        pj.id = 121;
        pj.namaMember = "Halda";
        pj.namaGame = "Fornite";
        pj.harga = 100000;
        pj.tampilDataPeminjaman();
        pj.hargaBayar(3);
    }
}
