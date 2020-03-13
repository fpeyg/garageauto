package com.a84.garageauto.fenetre;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Suivant extends AbstractAction {

    private JFrame fenetre;

    public Suivant(String texte, JFrame fenetre){
        super(texte);
        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("click sur menu barre suivant ");
        System.out.println("contenu frame " + this.fenetre.getContentPane());

        Panelencours panenc = new Panelencours();
        String sonnom = panenc.trouve(this.fenetre);

        if (sonnom.compareTo("Deuxieme") == 0) {
            this.fenetre.getContentPane().setVisible(false);
            Troisieme pansuivant = new Troisieme(this.fenetre);
            this.fenetre.setContentPane(pansuivant);
            this.fenetre.getContentPane().setVisible(true);
        } else {
            if (sonnom.compareTo("Troisieme") == 0) {
                System.out.println("ne rien faire !!");
            } else {
                this.fenetre.getContentPane().setVisible(false);
                Deuxieme pansuivant = new Deuxieme(this.fenetre);
                this.fenetre.setContentPane(pansuivant);
                this.fenetre.getContentPane().setVisible(true);
            }
        }


    }

}
