package tugasjb7;
public class SegitigaOverloading {
    private int sudut;
    
    void totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Total Sudut: "+sudut);
    }
    
    void totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut: "+sudut);
    }
    
    void keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
    }
    
    void keliling(int sisiA, int sisiB) {
        double keliling = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        System.out.println("Keliling: "+keliling);
    }
    
    public static void main(String[] args) {
        SegitigaOverloading ht = new SegitigaOverloading();
        
        ht.totalSudut(35);
        ht.totalSudut(15, 35);
        ht.keliling(15, 17, 19);
        ht.keliling(20, 30);
    }
    
}
