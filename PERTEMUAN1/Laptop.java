package tugaspraktikum1;

public class Laptop {

    private String merek;
   private String warna;
   private int volume; 
   
   public void setMerek(String newValue){
        merek = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void tambahVolume(int increment){
        volume = volume + increment;
    }
    public void KurangVolume(int decrement){
        volume = volume - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Volume : " + volume);
    }
}
