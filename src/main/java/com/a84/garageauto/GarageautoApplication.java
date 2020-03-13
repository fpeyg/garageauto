package com.a84.garageauto;

import com.a84.garageauto.fenetre.Premiere;
import com.a84.garageauto.m.Utilisateur;
import com.a84.garageauto.m.UtilisateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.awt.*;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GarageautoApplication {


	public static void main(String[] args) {
		SpringApplication.run(GarageautoApplication.class, args);

		EventQueue.invokeLater(() -> {
			Premiere fenetre = new Premiere();
			fenetre.setVisible(true);
		});
	}

}
