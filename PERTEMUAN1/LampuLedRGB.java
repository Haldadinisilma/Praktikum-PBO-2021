package tugaspraktikum1;

public class LampuLedRGB extends Lampu {

    private String warna;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Warna : " + warna);
    }
}
