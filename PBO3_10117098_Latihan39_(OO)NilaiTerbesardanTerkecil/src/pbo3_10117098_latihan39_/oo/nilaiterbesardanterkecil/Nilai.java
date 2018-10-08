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
public class Nilai {
    public int nilai[] = new int[100];
    public int nilaiBesar, nilaiKecil;

    public void inputNilai(int jmlMahasiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }

    public void tampilNilai(int jmlMahasiswa) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaiTerbesarTerkecil(int jmlMahasiswa) {
        int i;

        nilaiKecil = nilai[1];
        nilaiBesar = nilai[1];

        for (i = 1; i <= jmlMahasiswa; i++) {
            if (nilai[i] > nilaiBesar) {
               nilaiBesar = nilai[i];
            } else if (nilai[i] < nilaiKecil) {
                nilaiKecil = nilai[i];
            }
        }
    }
}
