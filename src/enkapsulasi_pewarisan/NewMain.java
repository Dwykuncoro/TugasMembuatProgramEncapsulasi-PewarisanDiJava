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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass dwi = new NewClass();
        dwi.setNama("Dwi Kuncoro");
        dwi.setTtl("Fajar Bulan 10 April 1996");
        dwi.setAlamat("Labuhan ratu");
        dwi.setAgama("Islam");
        dwi.setCita2("Programer");
        dwi.setHoby("Olahraga Badminton");
        dwi.setMh("Keberanian Harus Jauh Lebih Besar Daripada Ketakutan");
        System.out.println("Biodata Dwi Kuncoro");
        System.out.println("Nama                 = "+dwi.getNama());
        System.out.println("Tempat Tanggal Lahir = "+dwi.getTtl()+"\nAlamat               = "+dwi.getAlamat()+
                "\nAgama                = "+dwi.getAgama()+"\nCita-Cita            = "+dwi.getCita2()+
                "\nHoby                 = "+dwi.getHoby()+"\nMotto Hidup          = "+dwi.getMh());
        
        
        System.out.println("\n\nBiodata Orang Tua");
        Class2 coba = new Class2();
        coba.tampilkan();
        
    }
    
}
