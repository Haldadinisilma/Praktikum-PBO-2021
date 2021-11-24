package backend;
import java.util.ArrayList;
import java.sql.*;
public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota getById(int id) {
        Anggota anggota = new Anggota();
        ResultSet resultSet = DBHelper.selectQuery("SELECT * FROM anggota "
                + "WHERE idanggota = '" + id + "'");
        try {
            while (resultSet.next()) {
                anggota = new Anggota();
                anggota.setIdanggota(resultSet.getInt("idanggota"));
                anggota.setNama(resultSet.getString("nama"));
                anggota.setAlamat(resultSet.getString("alamat"));
                anggota.setTelepon(resultSet.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return anggota;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();
        ResultSet resultSet = DBHelper.selectQuery("SELECT * FROM anggota");
        try {
            while (resultSet.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdanggota(resultSet.getInt("idanggota"));
                anggota.setNama(resultSet.getString("nama"));
                anggota.setAlamat(resultSet.getString("alamat"));
                anggota.setTelepon(resultSet.getString("telepon"));
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE "
                + "nama LIKE '%" + keyword + "%' OR "
                + "alamat LIKE '%" + keyword + "%' OR "
                + "telepon LIKE '%" + keyword + "%'";
        ResultSet resultSet = DBHelper.selectQuery(sql);
        try {
            while (resultSet.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdanggota(resultSet.getInt("idanggota"));
                anggota.setNama(resultSet.getString("nama"));
                anggota.setAlamat(resultSet.getString("alamat"));
                anggota.setTelepon(resultSet.getString("telepon"));
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota(nama, alamat, telepon) VALUES ("
                    + "'" + this.nama + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "'"
                    + ")";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET "
                    + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "', "
                    + "telepon = '" + this.telepon + "'"
                    + "WHERE idanggota = '" + this.idanggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota
                + "'";
        DBHelper.executeQuery(SQL);
    }
}

