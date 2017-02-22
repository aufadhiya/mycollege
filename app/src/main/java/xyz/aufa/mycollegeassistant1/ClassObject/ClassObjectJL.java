package xyz.aufa.mycollegeassistant1.ClassObject;

import java.util.Date;

/**
 * Created by Dipayana on 2/5/2017.
 */

public class ClassObjectJL {
    String namaJL;
    Date Tanggal;
    String Waktu;
    String Deskripsi;

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date tanggal) {
        Tanggal = tanggal;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public String getNamaJL() {
        return namaJL;
    }

    public void setNamaJL(String namaJL) {
        this.namaJL = namaJL;
    }



}
