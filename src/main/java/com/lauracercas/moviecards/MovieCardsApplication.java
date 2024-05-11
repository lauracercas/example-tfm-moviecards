package com.lauracercas.moviecards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieCardsApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MovieCardsApplication.class);
        String springProfilesActive = System.getenv("SPRING_PROFILES_ACTIVE");
        if (springProfilesActive != null) {
            app.setAdditionalProfiles(springProfilesActive);
        }
        app.run(args);
//        SpringApplication.run(MovieCardsApplication.class, args);
    }

}
