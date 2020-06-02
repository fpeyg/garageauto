package com.a84.garageauto.fenetre;

import com.a84.garageauto.m.Utilisateur;
import com.a84.garageauto.m.UtilisateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;

public class Lesutilisateurs extends JPanel {

//    @Autowired
//    UtilisateurDAO utilisateurDAO;

    public Lesutilisateurs() {

        // info bulle panel
        this.setToolTipText("Contenu panel les utilisateurs ");

        //  JLabel pour le titre ===========================
        JLabel userLabel = new JLabel("Utilisateur");
        userLabel.setBounds(10, 20, 80, 25);
        add(userLabel);

        //  JLabel pour le nom  ===========================
        JLabel nomLabel = new JLabel("Nom");
        userLabel.setBounds(10, 20, 80, 25);
        add(nomLabel);

        // Text field pour la saisie du nom
        JTextField nomText = new JTextField(20);
        nomText.setBounds(100, 20, 165, 25);
        add(nomText);

        // JLabel pour le password ============================
        JLabel passwordLabel = new JLabel("Mot de passe");
        passwordLabel.setBounds(10, 50, 80, 25);
        add(passwordLabel);

        // Text field pour la saisie du mot de passe masqué par des points
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        add(passwordText);

        // JLabel pour la fonction =============================
        JLabel fonctionLabel = new JLabel("Fonction");
        fonctionLabel.setBounds(10, 20, 80, 25);
        add(fonctionLabel);

        // Text field pour la saisie de la fonction
        JTextField fonctionText = new JTextField(20);
        fonctionText.setBounds(100, 20, 165, 25);
        add(fonctionText);

        // JLabel pour le grade =============================
        JLabel gradeLabel = new JLabel("Grade");
        gradeLabel.setBounds(10, 20, 80, 25);
        add(gradeLabel);

        // Text field pour la saisie du grade avec combobox ????????????
        JTextField gradeInt = new JTextField(20);
        gradeInt.setBounds(100, 20, 165, 25);
        add(gradeInt);

        // Creating nouveau button
        JButton nouveauBouton = new JButton("Nouvel utilisateur");
        nouveauBouton.setBounds(10, 80, 80, 25);
        add(nouveauBouton);

        //  ajout Listener sur le bouton nouveau
        nouveauBouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("vous avez cliqué sur le bouton nouvel utilisateur " + nomText.getText());
                AjoutUtilisateur(nomText.getText());
            }
        });

    }





    public void AjoutUtilisateur (String nom) {



        UtilisateurDAO udao = new UtilisateurDAO()
        {
            @Override
            public boolean existsByNom(String nom) {
                return false;
            }

            @Override
            public Utilisateur findByNom(String nom) {
                return null;
            }

            @Override
            public List<Utilisateur> findAll() {
                return null;
            }

            @Override
            public List<Utilisateur> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Utilisateur> findAllById(Iterable<Integer> iterable) {
                return null;
            }

            @Override
            public <S extends Utilisateur> List<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Utilisateur> S saveAndFlush(S s) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<Utilisateur> iterable) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Utilisateur getOne(Integer integer) {
                return null;
            }

            @Override
            public <S extends Utilisateur> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Utilisateur> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Utilisateur> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Utilisateur> S save(S s) {
                return null;
            }

            @Override
            public Optional<Utilisateur> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Utilisateur utilisateur) {

            }

            @Override
            public void deleteAll(Iterable<? extends Utilisateur> iterable) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Utilisateur> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Utilisateur> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Utilisateur> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Utilisateur> boolean exists(Example<S> example) {
                return false;
            }
        };


        System.out.println("utilisateur " + nom);

        boolean found = udao.existsByNom(nom);
        System.out.println("utilisateur found " + nom);

        if (found) {
            System.out.println("utilisateur existe");
        } else {
            // ajout nouvel utilisateur
            Utilisateur u = new Utilisateur();
            u.setNom("patt");
            u.setMotdepasse("billy");
            u.setFonction("the kid");
            u.setGrade(0);
            udao.save(u);
            System.out.println("utilisateur ajouté ??");
        }
    }

}
