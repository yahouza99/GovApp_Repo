package com.govapp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Classe principale de l'application GovApp
 */
@SpringBootApplication(scanBasePackages = "com.govapp")
@EntityScan("com.govapp.core.entity")
@EnableJpaRepositories("com.govapp.core.repository")
public class GovAppApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(GovAppApplication.class, args);
    }
}
