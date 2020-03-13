package com.a84.garageauto.fenetre;

import javax.swing.*;


public class Panelencours {

    private JFrame fenencours;
    private String nomencours = "";

    public Panelencours() {
    }

    public Panelencours(JFrame fenencours, String nomencours) {
        this.fenencours = fenencours;
        this.nomencours = nomencours;
    }

    public String trouve(JFrame fenencours) {
        System.out.println("trouve : " + fenencours.getContentPane().toString());
        String chaineAPoint = fenencours.getContentPane().toString();
        if (chaineAPoint.split("\\.").length > 4) {
            if (chaineAPoint.split("\\.")[0].compareTo("com") == 0) {
                this.nomencours = chaineAPoint.split("\\.")[4].split("\\[")[0];
            }
        }
        System.out.println("nom : " + this.nomencours);
        return this.nomencours;
    }


    public JFrame getFenencours() {
        return fenencours;
    }

    public void setFenencours(JFrame fenencours) {
        this.fenencours = fenencours;
    }

    public String getNomencours() {
        return nomencours;
    }

    public void setNomencours(String nomencours) {
        this.nomencours = nomencours;
    }

    @Override
    public String toString() {
        return "Panelencours{" +
                "fenencours=" + fenencours +
                ", nomencours='" + nomencours + '\'' +
                '}';
    }
}
