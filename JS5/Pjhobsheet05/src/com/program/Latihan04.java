package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Latihan04 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String a, b ;
        float angka1, angka2, jumlah;
        System.out.println("program penjumlahan dua buah bilangan ");

        try{
            System.out.println("masukkan angka pertama");
            a = dataIn.readLine();
            angka1 = Float.parseFloat(a);

            System.out.println("masukkan angka kedua");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah=angka1+angka2;
            System.out.println("jumlah "+jumlah);
        }

        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }

    }
}
