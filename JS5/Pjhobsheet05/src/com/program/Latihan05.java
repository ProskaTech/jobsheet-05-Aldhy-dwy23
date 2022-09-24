package com.program;
// Created by 21343017_Aldhy
import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("nama anda : ");
        String hoby = JOptionPane.showInputDialog("hobi anda : ");

        String masuk = "jadi hobi anda "+hoby+". "+ "hobi yang bagus "+name;
        JOptionPane.showMessageDialog(null,  masuk);

 
    }
}
