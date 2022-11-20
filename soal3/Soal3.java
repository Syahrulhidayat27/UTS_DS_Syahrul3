/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Soal3 {

    public static void main(String[] args) {
        List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(1122331, "Leonel Messi", "TIFRM22A", 131122));
        mahasiswaList.add(new mahasiswa(1122332, "Christiano Ronaldo", "TIFRM22B", 131122));
        mahasiswaList.add(new mahasiswa(1122333, "Mbappe", "TIFK22A", 131122));
        mahasiswaList.add(new mahasiswa(1122334, "Erik Tohir", "TIFK22B", 131122));
        mahasiswaList.add(new mahasiswa(1122335, "PuanDragoon", "TIFRM22C", 131122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }
    
}
