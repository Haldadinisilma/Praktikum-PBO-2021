package Tugas;

public class Plant {

    public void doDestroy(Destroyable d) {
        if (d instanceof JumpingZombie) {
            ((JumpingZombie) d).destroyed();
            ((JumpingZombie) d).heal();
        } else if (d instanceof WalkingZombie) {
            ((WalkingZombie) d).destroyed();
            ((WalkingZombie) d).heal();
        }
    }
}
