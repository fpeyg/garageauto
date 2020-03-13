package com.a84.garageauto.fenetre;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class QuitterAction extends AbstractAction {
    public QuitterAction(String texte){
        super(texte);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}