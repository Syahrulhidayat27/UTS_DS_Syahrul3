/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal4 {

    public static void main(String[] args) {
       LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>();
        mahasiswaList.add(new Mahasiswa(1122331, "Leonel Messi", "TIFRM22A", 131122));
        mahasiswaList.add(new Mahasiswa(1122332, "Christiano Ronaldo", "TIFRM22B", 131122));
        mahasiswaList.add(new Mahasiswa(1122333, "Erik Tohir", "TIFK22A", 131122));
        mahasiswaList.add(new Mahasiswa(1122334, "PuanDragoon", "TIFK22B", 131122));
        mahasiswaList.add(new Mahasiswa(2255205, "Yanuar Saputra", "TIFRM22C", 181122));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

    }
}
