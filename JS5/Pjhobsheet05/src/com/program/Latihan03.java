package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan03 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "", hoby = "";

        try{
            System.out.println("nama anda : ");
            name = dataIn.readLine();
            System.out.println("hobi anda : ");
            hoby = dataIn.readLine();
        }

        catch(IOException e){
            System.out.println("gagal membaca keyboard");
        }

        System.out.println("jadi hobi anda " +hoby+ ". Hobi yang bagus" +name);

    }
}
