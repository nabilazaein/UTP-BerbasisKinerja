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
public class Main {
   public static void main(String[] args) {
        DataOutlet.dag = DataOutlet.tambahOutlet(new Outlet("Bakso Pak Sahid", "Bakso", 8000));
        DataOutlet.dag = DataOutlet.tambahOutlet(new Outlet("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataOutlet.dag = DataOutlet.tambahOutlet(new Outlet("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataOutlet.dag = DataOutlet.tambahOutlet(new Outlet(DataOutlet.in.nextLine(),DataOutlet.in.nextLine(),DataOutlet.in.nextDouble()));
        DataOutlet.tampilData();
    }
}
