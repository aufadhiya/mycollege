package xyz.aufa.mycollegeassistant1.ClassObject;

/**
 * Created by Sweetenest on 04/02/2017.
 */

public class ClassObjectJK {

    public ClassObjectJK(String hari, String ruang, String makul, String Dosen, int jam, int menit){
        this.hari=hari;
        this.ruang=ruang;
        this.makul=makul;
        this.Dosen=Dosen;
        this.Kelas=Kelas;
        this.jam=jam;
        this.menit=menit;

    }
    private String hari;
    private String ruang;
    private String makul;
    private int jam;
    private int menit;
    private String Dosen;
    private String Kelas;


    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public String getDosen() {
        return Dosen;
    }

    public void setDosen(String dosen) {
        Dosen = dosen;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }


}
