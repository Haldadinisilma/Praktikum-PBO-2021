package tugaspraktikum1;

public class LampuPijar extends Lampu {

    private String bentuk;

    public void setBentuk(String newValue) {
        bentuk = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Bentuk: " + bentuk);
    }
}
