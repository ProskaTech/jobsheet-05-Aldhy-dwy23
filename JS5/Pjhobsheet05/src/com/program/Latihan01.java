package com.program;
// Created by 21343017_Aldhy
import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("masukkan nama lengkap : ");
        String nama = in.nextLine();

        System.out.println("masukkan NIM : ");
        int NIM = in.nextInt();

        System.out.println("masukkan Nilai :");
        float nilai = in.nextFloat();

            System.out.println("\n Nama : " +nama +
                                "\n Nim : " +NIM +
                                "\n Nilai : " +nilai);
    }
}

