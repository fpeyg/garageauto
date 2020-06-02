package com.a84.garageauto.fenetre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JPanel {

    private JFrame parent;

    private JButton vehicule = new JButton("Les véhicules");
    private JButton utilisateur = new JButton("Les utilisateurs");;
    private JButton client = new JButton("Les clients");
    private JButton vente = new JButton("Les ventes");
    private JButton document = new JButton("Les documents");


    public Menu(JFrame parent) {

        this.parent = parent;
        System.out.println("contenu frame  " + parent.getContentPane());

        // info bulle panel
        this.setToolTipText("Contenu panel menu fenêtre");

        // layout de base est BorderLayout
        this.setLayout(new BorderLayout());

        // boutons de gauche dans un GridLayout pour être en colonne
        JPanel gauche = new JPanel();

        // boutons de droite dans GridLayout aussi
        JPanel droite = new JPanel();

        GridLayout glgh = new GridLayout();
        glgh.setRows(4);
        glgh.setColumns(1);
        glgh.setHgap(60);
        glgh.setVgap(60);
        gauche.setLayout(glgh);

        GridLayout gldr = new GridLayout();
        gldr.setRows(1);
        gldr.setColumns(1);
        gldr.setHgap(60);
        gldr.setVgap(60);
        droite.setLayout(gldr);

        // ajout des deux panels sur celui de base
        this.add(new JLabel("Dirigeant"), BorderLayout.NORTH);
        this.add(gauche, BorderLayout.CENTER);
        this.add(droite, BorderLayout.EAST);

        //  ajout boutons sur les conteneurs
        gauche.add(vehicule);
        gauche.add(client);
        gauche.add(vente);
        gauche.add(document);
        droite.add(utilisateur);

        //ajoute un listener pour chaque bouton
        vehicule.addActionListener(new TraitementVehicule());
        utilisateur.addActionListener(new TraitementUtilisateur());

    }

    public  class  TraitementVehicule implements ActionListener {

        public  void    actionPerformed(ActionEvent e) {
            System.out.println("Traitement des véhicules!");
        }
    }

    public  class  TraitementUtilisateur implements  ActionListener {

        public  void  actionPerformed(ActionEvent e) {
            System.out.println("Traitement des utilisateurs!");

            AfficheUtilisateurs(parent);

        }
    }

    public void AfficheUtilisateurs(JFrame parent) {

        Lesutilisateurs gestion = new Lesutilisateurs();
        parent.setContentPane(gestion);
        parent.getContentPane().setBackground(Color.lightGray);
        parent.setVisible(true);

    }
}
