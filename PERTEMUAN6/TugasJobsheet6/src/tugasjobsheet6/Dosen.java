package tugasjobsheet6;

public class Dosen extends Pegawai {

    protected int jumlahSKS;
    protected int TARIF_SKS;

    Dosen(int tarifsks, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.TARIF_SKS = tarifsks;
    }

    public void setSKS() {
        jumlahSKS = 17;
    }

    public int getGaji() {
        int gaji = jumlahSKS * TARIF_SKS;
        System.out.println("Gaji Dosen : " + gaji);
        return gaji;
    }
}
