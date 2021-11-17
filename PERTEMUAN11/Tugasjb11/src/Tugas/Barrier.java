package Tugas;

public class Barrier implements Destroyable {

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroy() {
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.5;
    }

    public String getBarrierinfo() {
        return "Barrier Strenght = " + strength + " \n";
    }
}
