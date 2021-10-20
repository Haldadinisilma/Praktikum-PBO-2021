package tugasjb7.overriding;
public class Utama {
    public static void main(String[] args) {
        Manusia mn = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mh = new Mahasiswa();
        
        mn.bernafas();
        mn.makan();
        ds.makan();
        ds.lembur();
        mh.makan();
        mh.tidur();
    }
}
