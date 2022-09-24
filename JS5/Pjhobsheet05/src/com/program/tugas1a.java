package com.program;
// Created by 21343017_Aldhy
import java.util.Scanner;

public class tugas1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("masukkan Kata Pertama : ");
        String kata1 = in.nextLine();

        System.out.println("masukkan Kata kedua : ");
        String kata2 = in.nextLine();

        System.out.println("masukkan kata ketiga :");
        String kata3 = in.nextLine();

            System.out.println("\n Enter word 1 : " +kata1 +
                                "\n Enter word 2 : " +kata2 +
                                "\n Enter word 3 : " +kata3+
                                "\n "+
                                kata1+" "+ kata2+" "+ kata3 );
    }
}
