/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class latihan23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Progam Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        // Meminta nama petugas
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        // Meminta banyaknya nilai mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyaknyaNilaiMahasiswa = scanner.nextInt();

        // Inisialisasi array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];

        // Memasukkan nilai-nilai mahasiswa ke dalam array
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // Inisialisasi nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        // Mencari nilai terbesar dan terkecil
        for (int i = 1; i < banyaknyaNilaiMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        // Menampilkan hasil
        System.out.println("\n");
        System.out.println("======Hasil Nilai Mahasiswa======");
        System.out.println("\n");
        System.out.println("Nilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("\n");
        System.out.println("Petugas: "+ namaPetugas);
        
        // Menutup scanner
        scanner.close();
    }
    
}

