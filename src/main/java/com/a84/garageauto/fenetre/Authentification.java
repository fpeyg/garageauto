package com.a84.garageauto.fenetre;

import com.a84.garageauto.m.Utilisateur;
import com.a84.garageauto.m.UtilisateurDAO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;


public class Authentification extends JPanel {

    private JFrame parent;

    public Authentification() {
    }

    public Authentification(JFrame parent) {

        this.parent = parent;

        // info bulle panel
        this.setToolTipText("Contenu panel authentification fenêtre ");

        // Creating JLabel
        JLabel userLabel = new JLabel("User");
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are cordinates from the top left
         * corner and remaining two arguments are the width
         * and height of the component.
         */
        userLabel.setBounds(10,20,80,25);
        add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        add(passwordLabel);

        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        add(passwordText);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        add(loginButton);

        //  ajout Listener sur le bouton login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("vous avez cliqué sur le bouton login");
                if (IsVide()) {
                    Affichemenu(parent);
                }
            }

        });

    }

    public boolean IsVide() {

        UtilisateurDAO us = new UtilisateurDAO() {
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

        System.out.println("compteur de la table utilisateur : " + us.count());
        if (us.count() == 0) {
            return true;
        }
        return false;
    }

    public void Affichemenu(JFrame parent) {

        Menu actions = new Menu(parent);
        parent.setContentPane(actions);
        parent.getContentPane().setBackground(Color.orange);
        parent.setVisible(true);

    }


}
