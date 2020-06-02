package com.a84.garageauto.fenetre;

import javax.swing.*;
import java.awt.*;


public class Debut extends JFrame {

    private JMenuBar menubarre = new JMenuBar();
    private JPanel pan1 = new JPanel(new BorderLayout()); // panel

    public Debut() {

        this.setTitle("Suivi des véhicules vendus");
        this.setSize(800,600);
        this.setResizable(true); // taille modifiable par l'utilisateur
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// un click sur croix entraine la fermeture de la fenêtre
        this.setLocationRelativeTo(null); // centrer la fenêtre par rapport à l'écran de l'ordinateur


        this.menubarre.setBackground(new Color(154, 165, 127));
        this.menubarre.setPreferredSize(new Dimension(200, 40));

        // ajouter un des élements sur le menubarre
        JMenuItem precedent = new JMenuItem(new Precedent("Précédent", this));
        this.menubarre.add(precedent);

        JMenuItem suivant = new JMenuItem(new Suivant("Suivant", this));
        this.menubarre.add(suivant);

        JMenuItem quitter = new JMenuItem(new QuitterAction("Quitter"));
        this.menubarre.add(quitter);

        // Set the menu bar
        this.setJMenuBar(this.menubarre);

        // definir un Layout Manager
        // utilisation de FlowLayout
        // attacher le LayoutManager au panel
        pan1.setLayout(new FlowLayout(FlowLayout.CENTER));

        // ajout panel sur la Frame
        setContentPane(getPan1());
//        this.add(this.pan1);

        // infobulle panel
        this.pan1.setToolTipText("Contenu panel première fenêtre");

        // on cree le JPanel principal en utilisant  un OverlayLayout:
        // il faut créer un nouveau JPanel avec un OverlayLayout comme layout manager
        // ajouter les 2 JPanel (ou plus)au JPanel précédent avec la méthode add()
        // inter-changer entre les JPanel en utilisant setVisible()

        this.pan1.setLayout(new OverlayLayout(this.pan1));

        //on y ajoute les autres JPanel
        this.pan1.add(new Authentification(this));
        this.pan1.add(new Menu(this));

        // rendre la Frame visible
        this.setVisible(true);
    }

    public JMenuBar getMenubarre() {
        return menubarre;
    }

    public void setMenubarre(JMenuBar menubarre) {
        this.menubarre = menubarre;
    }

    public JPanel getPan1() {
        return pan1;
    }

    public void setPan1(JPanel pan1) {
        this.pan1 = pan1;
    }


}
