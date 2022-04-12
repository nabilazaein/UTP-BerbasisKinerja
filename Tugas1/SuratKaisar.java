/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suratkaisar;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        int nilai = scan.nextInt();
        String hasileksekusi = pergeseran(user, nilai);
        
        System.out.println(hasileksekusi);
    }
    
    public static String pergeseran(String user, int nilai){
        String alfabet2 = "";
        for(int i = 0; i < user.length(); i++){
            char k = user.charAt(i);
            int alfabet = k;
            int hitung = alfabet + nilai;
            
            if(k >= 'a' && k <= 'z'){
                if(hitung > 122 ){
                     hitung = 96 + (hitung - 122);
                }
                    alfabet2 += String.valueOf((char)hitung);  
                
            }else if(k >= 'A' && k <= 'Z'){
                if(hitung > 90 ){
                     hitung = 64 + (hitung - 90);
                }
                    alfabet2 += String.valueOf((char)hitung);
                
            }else{
                    alfabet2 += String.valueOf(k);
                
            }
        }
        return alfabet2;
    }
}