/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldonasabah;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.*;

public class SaldoNasabah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal = input.nextDouble();
        double saldoSetor = input.nextDouble();
        System.out.println(saldoTotal(saldoAwal, saldoSetor));
    }
    public static double biayaAdmin(double saldoAwal, double saldoSetor){
        double saldoSkrg = saldoAwal + saldoSetor;
        double biayaAdmin = saldoSkrg - 7000;
        return biayaAdmin;
    }
    public static double saldoTotal(double saldoAwal, double saldoSetor){
        double bonus = 0.0005;
        double saldoAkhir = biayaAdmin(saldoAwal, saldoSetor) * bonus;
        double saldoTotal = biayaAdmin(saldoAwal, saldoSetor) + saldoAkhir;
        return saldoTotal;
    }
}
