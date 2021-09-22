package tugasjb3;

public class Anggota {

    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPeminjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPinjaman;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }
    
    public void setLimitPeminjaman(int newLimit) {
        limitPeminjaman = newLimit;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }
    
    public void pinjam(int newPinjam) {
        if (newPinjam > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPeminjaman = jumlahPeminjaman + newPinjam;
        }
    }
    
    public void angsur(int newAngsur) {
        if (newAngsur < 0.1 * jumlahPeminjaman) {
            System.out.println("Maaf Angsuran harus 10% dari jumlah peminjaman");
        } else {
            jumlahPeminjaman = jumlahPeminjaman - newAngsur;
        }
    }
}
