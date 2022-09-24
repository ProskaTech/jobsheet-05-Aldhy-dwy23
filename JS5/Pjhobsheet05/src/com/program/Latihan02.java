package com.program;
// Created by 21343017_Aldhy

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
    
    float angka1, angka2, jumlah;
    Scanner dataMasuk = new Scanner(System.in);
   
    System.out.println("masukkan angka ke=1 : ");
    angka1 = dataMasuk.nextFloat();

    System.out.println("masukkan angka ke-2 : ");
    angka2 = dataMasuk.nextFloat();

    jumlah = angka1 + angka2;

    System.out.println("angka ke-1 : " +angka1);
    System.out.println("angka ke-2 : " +angka2);   
    System.out.println("jumlah : " +jumlah);


    }
}
