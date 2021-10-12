package tugasjobsheet6;

public class DaftarGaji {

    protected Pegawai listPegawai[];
    public int jmlp;

    DaftarGaji(int jml) {
        listPegawai = new Pegawai[jml];
    }

    public void addPegawai(Pegawai pg) {
        listPegawai[jmlp] = pg;
        jmlp++;
    }

    public void printSemuaGaji() {
        for (int a = 0; a < jmlp; a++) {
            System.out.println("Nama : " + listPegawai[a].getNama());
            System.out.println("NIP : " + listPegawai[a].nip);
            System.out.println("Alamat : " + listPegawai[a].alamat);
            System.out.println("Gaji : " + listPegawai[a].getGaji());
            System.out.println();
        }
    }
}
