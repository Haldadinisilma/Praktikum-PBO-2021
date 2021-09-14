package tugaspraktikum;

public class Lingkaran {

    public double phi;
    public double r;

    public void hitungLuas() {
        double L = phi * r * r;
        System.out.println("Luas Lingkaran : " + L);
    }

    public void hitungKeliling() {
        double K = 2 * phi * r;
        System.out.println("Keliling Lingkaran : " + K);
    }
}
