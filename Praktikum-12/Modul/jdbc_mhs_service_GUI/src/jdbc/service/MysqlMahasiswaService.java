/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author yusuf
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;


public class MysqlMahasiswaService {

  Connection koneksi = null;

  public MysqlMahasiswaService() {
    koneksi = MysqlUtility.getConnection();
  }

  public Mahasiswa makeMhsObject() {
    return new Mahasiswa();
  }

  public void add(String nama) {
    String query = "INSERT INTO mahasiswa(nama) VALUES('" + nama+"')";
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("Berhasil insert");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void update(Mahasiswa mhs) {
    String query = "UPDATE mahasiswa SET nama='" + mhs.getNama() + "' WHERE id=" + mhs.getId();
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("Berhasil update");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void delete(int id) {
    String query = "DELETE FROM mahasiswa WHERE id=" + id;
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("Berhasil delete");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Mahasiswa getById(int id) {
    Mahasiswa mhs = new Mahasiswa();
    String query = "SELECT * FROM mahasiswa WHERE id=" + id;
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      if (rs.next()) {
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return mhs;
  }

  public List<Mahasiswa> getAll() {
    List<Mahasiswa> mahasiswaList = new ArrayList<>();
    String query = "SELECT * FROM mahasiswa";
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      while (rs.next()) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        mahasiswaList.add(mhs);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return mahasiswaList;
  }
  
  // New method to reset index
    public void indexReset() {
        String resetIndexQuery = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(resetIndexQuery);
            System.out.println("Index berhasil direset");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // New method to check if table is empty
    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // New method to close the connection
    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


