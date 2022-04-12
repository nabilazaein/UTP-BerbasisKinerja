/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubcompany;

/**
 *
 * @author hp
 */
public class Outlet {
 String namaOutlet,namaProduk;
    double hargaMakanan;

    Outlet(String namaOutlet, String namaProduk, double hargaMakanan){
        this.namaOutlet   = namaOutlet;
        this.namaProduk   = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaOutlet(){
        return namaOutlet;
    }
    public void setNamaOutlet(String namaOutlet){
        this.namaOutlet = namaOutlet;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
}
