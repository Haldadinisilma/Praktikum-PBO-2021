package Tugas;
public class Keluarga {
    private String keluarga;
    private Frozen ortu;
    
    Keluarga() {

    }
    
    public void setKeluarga(String keluarga) {
        this.keluarga = keluarga;
    }
    
    public String getKeluarga() {
        return keluarga;
    }
    
    public void setorangTua(Frozen ortu) {
        this.ortu = ortu;
    }
    
    public Frozen getorangTua() {
        return ortu;
    }
    
    public String info() {
        String info = "";
        info += "Keluarga : " + keluarga + "\n";
        info += "Ortu : " + ortu + "\n";
        return info;
    }
}
