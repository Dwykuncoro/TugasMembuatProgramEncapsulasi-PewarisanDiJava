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
public class Class2 extends NewClass{
    public void tampilkan(){
        String umurayah  ="53 Tahun";
        String umuribu   ="48 Tahun";
        String umurkakak ="25 Tahun";
        String Suku      ="Jawa (Solo)";
        
        NewClass kuncoro = new NewClass();
        kuncoro.Input("PAERAN", "LILIS", 1, "Anna Sahroni");
        kuncoro.Tampil();
        
        System.out.println("Umur Ayah                = "+umurayah);
        System.out.println("Umur Ibuk                = "+umuribu);
        System.out.println("Umur Kakak               = "+umurkakak);
        System.out.println("Suku/Asal                = "+Suku);
        
        
    }
    
    
}
