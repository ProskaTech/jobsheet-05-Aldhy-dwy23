package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas1b {
    public static void main(String[] args) throws IOException{
        BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("masukkan kata pertama : ");
        String pertama = dataMasuk.readLine();

        System.out.println("masukkan kata kedua : ");
        String kedua = dataMasuk.readLine();
        
        System.out.println("masukkan kata ketiga : ");
        String ketiga = dataMasuk.readLine();

        System.out.println("\n Enter word 1 : " +pertama +
        "\n Enter word 2 : " +kedua +
        "\n Enter word 3 : " +ketiga+
        "\n "+
        pertama+" "+ kedua+" "+ ketiga );

    }
}
