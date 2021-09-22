package tugasjb3;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinjam; 
        int angsur;
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());
        System.out.println("");
        
        System.out.println("Masukkan jumlah uang yang dipinjam : ");
        pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjam saat ini : "+donny.getLimitPeminjaman());
        System.out.println("");
        
        System.out.println("Masukkan jumlah uang yang dipinjam : ");
        pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjam saat ini : "+donny.getLimitPeminjaman());
        System.out.println("");
        
        System.out.println("Masukkan jumlah angsuran : ");
        angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getLimitPeminjaman());
        System.out.println("");
        
        System.out.println("Masukkan jumlah angsuran : ");
        angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getLimitPeminjaman());
        System.out.println("");
        
    }
}
