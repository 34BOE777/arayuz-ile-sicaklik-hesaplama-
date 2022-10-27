package com.company;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "");
        String a1 = JOptionPane.showInputDialog("fahrenheit hesaplaması için 1, celcius hesaplması için 2'yi, çıkış yapmak için 3'ü tuşlayın");

        int s1 = Integer.parseInt(a1);


        if (s1 == 1) {
            String a2 = JOptionPane.showInputDialog("celcius değeri gir");
            int s2 = Integer.parseInt(a2);
            double sum = 9 / 5 * (s2) + 32;
            JOptionPane.showMessageDialog(null, sum + "Fahrenheit");
        } else if(s1==2){
            String a2 = JOptionPane.showInputDialog("Fahrenheit değeri gir");
            int s2 = Integer.parseInt(a2);
            double sum = (s2 - 32) * 5 / 9;
            JOptionPane.showMessageDialog(null, sum + "celsius");
        }else if(s1==3){
            System.exit(0);
        }
        
    }
    }
