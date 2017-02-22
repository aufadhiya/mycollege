package xyz.aufa.mycollegeassistant1.ClassObject;

import java.util.Date;

/**
 * Created by Sweetenest on 07/02/2017.
 */

public class ClassObjectUser {
    private String id_user;

    private String email;
    private String password;
    private String nama;
    private String universitas;
    private String Jurusan;
    private String Kelas;
    private String TTL;
    private String Lokasi;
    private Date tanggaldibuat;

    public ClassObjectUser(String email,String password,String nama){
        this.email = email;
        this.password = password;
        this.nama = nama;
    }
    public ClassObjectUser(String email,String password,String nama,String universitas, String Jurusan, String kelas, String ttl ,String Lokasi){
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.universitas = universitas;
        this.Jurusan = Jurusan;
        this.Kelas = kelas;
        this.TTL = ttl;
        this.Lokasi = Lokasi;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public Date getTanggaldibuat() {
        return tanggaldibuat;
    }

    public void setTanggaldibuat(Date tanggaldibuat) {
        this.tanggaldibuat = tanggaldibuat;
    }

}
