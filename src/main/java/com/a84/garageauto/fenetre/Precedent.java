package com.a84.garageauto.fenetre;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Precedent extends AbstractAction {

    private JFrame fenetre;

    public Precedent(String texte, JFrame fenetre){
        super(texte);
        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("click sur menu barre précédent ");
        System.out.println("contenu frame " + this.fenetre.getContentPane());

        Panelencours panenc = new Panelencours();
        String sonnom = panenc.trouve(this.fenetre);


        if (sonnom.compareTo("Troisieme") == 0) {
            this.fenetre.getContentPane().setVisible(false);
            Deuxieme panprecedent = new Deuxieme(this.fenetre);
            this.fenetre.setContentPane(panprecedent);
            this.fenetre.getContentPane().setVisible(true);
        } else {
            if (sonnom.compareTo("Deuxieme") == 0) {
                System.out.println("on est déja à la deuxième");
            } else {
                this.fenetre.getContentPane().setVisible(false);
                Deuxieme panprecedent = new Deuxieme(this.fenetre);
                this.fenetre.setContentPane(panprecedent);
                this.fenetre.getContentPane().setVisible(true);
            }
        }
    }

}
