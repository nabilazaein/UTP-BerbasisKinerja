/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungluas1;



/**
 *
 * @author hp
 */
import java.io.*;
import java.util.*;
public class MenghitungLuas1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();
        
        if (pilih == 1){
            int s = scan.nextInt();
            System.out.println(persegi(s));
        }
        else if (pilih == 2){
            double a = scan.nextDouble();
            double t = scan.nextDouble();
            System.out.println(Segitiga(a, t));
        }
        else if (pilih == 3){
            double jari = scan.nextDouble();
            if (jari % 7 == 0){
                System.out.println(Lingkaran(jari));
            }
            else 
             System.out.println(Lingkaran2(jari));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(int sisi){
        int luas = sisi*sisi;
        return luas;
    }
    public static int Segitiga(Double alas, Double tinggi){
        int luas = (int) (alas*tinggi/2);
        return luas;
    }
    public static double Lingkaran(double r){
        double luas = 22/7 * r * r;
        return luas;
    }
    public static double Lingkaran2(double r){
        double luas = 3.14 * r* r;
        int hasil = (int)luas; 
        return hasil;
    }
}