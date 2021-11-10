package tugasjb10;
public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;
    
    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama,jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Binatang jinak");
    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan daun dan rumput");
    }
    
    public void displayData() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
    }
}
