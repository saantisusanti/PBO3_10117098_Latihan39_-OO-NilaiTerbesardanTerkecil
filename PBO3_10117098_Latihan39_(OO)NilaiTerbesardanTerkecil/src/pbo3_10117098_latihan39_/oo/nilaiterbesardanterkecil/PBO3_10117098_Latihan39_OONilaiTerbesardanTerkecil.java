/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan39_.oo.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan nilai 
 *                     terbesar dan terkecil yang di input oleh user dengan 
 *                     konsep OOP
 */
public class PBO3_10117098_Latihan39_OONilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaPetugas;
        int jmlMahasiswa;

        Nilai hasil = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMahasiswa = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMahasiswa);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMahasiswa);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
