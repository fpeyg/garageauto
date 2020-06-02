package com.a84.garageauto;

import com.a84.garageauto.fenetre.Debut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.awt.*;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GarageautoApplication {


	public static void main(String[] args) {
		SpringApplication.run(GarageautoApplication.class, args);

		EventQueue.invokeLater(() -> {
			Debut fenetre = new Debut();
			fenetre.setVisible(true);
		});
	}

}
