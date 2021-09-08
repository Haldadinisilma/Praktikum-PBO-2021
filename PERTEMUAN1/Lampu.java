package tugaspraktikum1;

public class Lampu {

    private String merek;
    private int watt;
    private String kondisi;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWatt(int newValue) {
        watt = newValue;
    }

    public void setKondisi(String newValue) {
        kondisi = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Kondisi : " + kondisi);
        System.out.println("Watt : " + watt);
    }
}
