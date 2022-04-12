/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubcompany;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class DataOutlet {
static Scanner in = new Scanner(System.in);
    static Outlet[] dag = new Outlet[0];

    public static Outlet[] tambahOutlet(Outlet dagang){
        Outlet temp[]=new Outlet[DataOutlet.dag.length+1];
        for (int i = 0; i < DataOutlet.dag.length; i++){
            temp[i]=DataOutlet.dag[i];
        }
        temp[DataOutlet.dag.length]=dagang;
        return temp;
    }

    public static void tampilData(){
        for (Outlet mch1 : dag){
            System.out.println("---Brawijaya food court---");
            System.out.println("Nama Outlet     : "+mch1.getNamaOutlet());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Outlet cariWarung (String nama){
        for (int i = 0; i < DataOutlet.dag.length; i++){
            if (nama.equalsIgnoreCase(DataOutlet.dag[i].getNamaOutlet())){
                return DataOutlet.dag[i];
            }
        }
        return null;
    }
}