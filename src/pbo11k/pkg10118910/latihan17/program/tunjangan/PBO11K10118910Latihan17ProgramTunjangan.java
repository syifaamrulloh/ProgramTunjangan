/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan17.program.tunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program menghitung tunjangan
 */
public class PBO11K10118910Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tunjangan,total;
        // LOAD SCANNER
        Scanner scan = new Scanner(System.in);
        
        //INPUT
        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa gaji poko anda perbulan?\t: ");
        double gj = scan.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        String stat = scan.next();
        
        //KONDISI
        tunjangan =("menikah".equals(stat) || "Menikah".equals(stat))? 0.35*gj:0;
        total = gj + tunjangan;
        //OUTPUT
        System.out.println("========= Hasil Tunjangan ==========");
        System.out.println("Gajih\t\t:Rp. " + gj);
        System.out.println("Tunjangan\t:Rp. " + tunjangan);
        System.out.println("Total Gaji\t:Rp. " + total);
        
        System.out.println("(Developed by : Muhamad Syifa Amruloh)");
    }
    
}
