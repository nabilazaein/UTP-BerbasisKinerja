import java.io.*;
import java.util.*;

    class Persegi{
    void Luaspersegi(int s){
        System.out.println(s*s);
        }
    }
    class Segitiga{
    void Luassegitiga(int a, int t){
        System.out.println(a*t / 2);
        }
    }
    class Lingkaran{
    void Luaslingkaran(double r){
        if(r%7 == 0){
            double hasil = 22/7 * (r*r);
            System.out.println(hasil);
        } else {
            double hasil = 3.14 * (r*r);
            int result = (int)hasil;
            System.out.println((double)result);
        }
        }
    }

    public class Solution {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();
        
        if(menu == 1){
            int s = scan.nextInt();
            Persegi Luaspersegi = new Persegi();
            Luaspersegi.Luaspersegi(s);
        }
        else if(menu == 2){
            int a = scan.nextInt();
            int t = scan.nextInt();
            Segitiga Luassegitiga = new Segitiga();
            Luassegitiga.Luassegitiga(a,t);
        }
        else if(menu == 3){
            int r = scan.nextInt();
            Lingkaran Luaslingkaran = new Lingkaran();
            Luaslingkaran.Luaslingkaran(r);
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    }