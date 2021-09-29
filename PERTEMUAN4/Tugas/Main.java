package Tugas;
public class Main {
    public static void main(String[] args) {
        Frozen f = new Frozen();
        f.setNama("Elsa");
        Keluarga k = new Keluarga();
        k.setKeluarga("Kerajaan");
        Teman t = new Teman();
        t.setnamaTeman("Kristoff");
        Peliharaan p = new Peliharaan();
        p.setnamaHewan("Sven");
        
       System.out.println(f.getNama());
       System.out.println(k.getKeluarga());
       System.out.println(t.getnamaTeman());
       System.out.println(p.getnamHewan());
    }

}
