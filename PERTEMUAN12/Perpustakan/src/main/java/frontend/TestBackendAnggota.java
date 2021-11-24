package frontend;

import backend.*;

public class TestBackendAnggota {

    public static void main(String[] args) {

        Anggota agt1 = new Anggota("Kynanti", "Malang", "03412");
        Anggota agt2 = new Anggota("Devo", "Lampung", "03422");
        Anggota agt3 = new Anggota("Mila", "Malang", "03454");
        // test insert
        agt1.save();
        agt2.save();
        agt3.save();
        // test update
        agt2.setTelepon("03412");
        agt2.save();
        // test delete
        agt3.delete();
        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ",Telepon: " + a.getTelepon());
        }
        // test search
        for (Anggota a : new Anggota().search("Malang")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ",Telepon: " + a.getTelepon());
        }
    }
}
