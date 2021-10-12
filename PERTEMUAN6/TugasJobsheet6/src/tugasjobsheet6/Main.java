package tugasjobsheet6;

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen(50000, "2041720014", "Halda Dini Silma Rosida", "Malang");
        dosen.setSKS();
        Pegawai pegawai = new Pegawai("179366789", "Andy Pratama", "Lumajang");
        DaftarGaji daftarGaji = new DaftarGaji(25000);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);
        daftarGaji.printSemuaGaji();

    }
}
