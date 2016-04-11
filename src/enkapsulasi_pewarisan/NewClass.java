/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_pewarisan;

/**
 *
 * @author Des_Calsa
 */
public class NewClass {
    String nama;
    String ttl;
    String alamat;
    String agama;
    String Cita2;
    String hoby;
    String mh; 
    
    
    
private String ayah;

    public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    public String getIbuk() {
        return ibuk;
    }

    public void setIbuk(String ibuk) {
        this.ibuk = ibuk;
    }

    public String getKakak() {
        return kakak;
    }

    public void setKakak(String kakak) {
        this.kakak = kakak;
    }

    public int getJumlahsaudara() {
        return jumlahsaudara;
    }

    public void setJumlahsaudara(int jumlahsaudara) {
        this.jumlahsaudara = jumlahsaudara;
    }
private String ibuk;
private String kakak;
private int jumlahsaudara;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getCita2() {
        return Cita2;
    }

    public void setCita2(String Cita2) {
        this.Cita2 = Cita2;
    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String mh) {
        this.mh = mh;
    }
    public void Tampil(){
        System.out.println("Nama Ayah                = "+getAyah());
        System.out.println("Nama Ibuk                = "+getIbuk());
        System.out.println("Jumlah Saudara Kandung   = "+getJumlahsaudara());
        System.out.println("Nama Kakak               = "+getKakak());
        
    }
    public void Input(String a,String i, int j, String k){
        setAyah(a);
        setIbuk(i);
        setJumlahsaudara(j);
        setKakak(k);   
    }
}
