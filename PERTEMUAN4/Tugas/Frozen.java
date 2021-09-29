package Tugas;
public class Frozen {
    private String nama;

    Frozen() {
      
    }
    
    Frozen(String nama) {
        this.nama = nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
