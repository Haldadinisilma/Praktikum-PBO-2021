/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.ArrayList;
import java.sql.*;

public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori "
                + " WHERE p.idpeminjaman = '" + id + "'");
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> listAnggota = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori ");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                listAnggota.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> listAnggota = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan " + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori "
                + " WHERE a.idanggota LIKE '%" + keyword + "%' "
                + " OR b.idbuku LIKE '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                listAnggota.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam,tanggalkembali) VALUES("+ " '" + this.anggota.getIdanggota() + "', "
                    + " '" + this.buku.getIdbuku() + "', "
                    + " '" + this.tanggalpinjam + "',"
                    + " '" + this.tanggalkembali + "' "
                    + ")";
            this.idpeminjaman
                    = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE peminjaman SET "
                    + " idanggota = '" + this.anggota.getIdanggota() + "', "
                    + " idbuku = '" + this.buku.getIdbuku() + "', "
                    + " tanggalpinjam = '" + this.tanggalpinjam + "',"
                    + " tanggalkembali = '" + this.tanggalkembali + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '"
                + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
}

