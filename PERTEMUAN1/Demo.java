package tugaspraktikum1;
public class Demo {
    public static void main(String[] args){
        Motor mtr = new Motor();
        Laptop ltp = new Laptop();
        Lampu lp1 = new Lampu();
        LampuPijar lp2 = new LampuPijar();
        LampuLedRGB lp3 = new LampuLedRGB();
        
        //Panggil method Motor
        System.out.println("----------");
        System.out.println("   MOTOR  ");
        System.out.println("----------");
        mtr.setMerek("Jupiter");
        mtr.setWarna("Hitam");
        mtr.tambahKecepatan(15);
        mtr.cetakStatus();
        System.out.println("");
        
         //Panggil method Laptop
        System.out.println("----------");
        System.out.println("  LAPTOP  ");
        System.out.println("----------");
        ltp.setMerek("HP");
        ltp.setWarna("Abu-Abu");
        ltp.tambahVolume(10);
        ltp.cetakStatus();
        System.out.println("");
        
         //Panggil method Lampu
        System.out.println("-----------");
        System.out.println("   LAMPU   ");
        System.out.println("-----------");
        lp1.setMerek("Panasonic");
        lp1.setKondisi("Menyala");
        lp1.setWatt(5);
        lp1.cetakStatus();
        System.out.println("");
        
        //Panggil method Lampu pijar
        System.out.println("-----------");
        System.out.println("LAMPU PIJAR");
        System.out.println("-----------");
        lp2.setMerek("Philip");
        lp2.setKondisi("Menyala");
        lp2.setWatt(5);
        lp2.setBentuk("Bohlam");
        lp2.cetakStatus();
        System.out.println("");
        
        //Panggil method Lampu Led RGB
        System.out.println("-------------");
        System.out.println("LAMPU LED RGB");
        System.out.println("-------------");
        lp3.setMerek("Vonic");
        lp3.setKondisi("Menyala");
        lp3.setWatt(5);
        lp3.setWarna("Biru");
        lp3.cetakStatus();
     
    }
}
