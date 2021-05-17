package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TraineeSpringWebApp {

    public static void main(String[] args) {
        SpringApplication.run(TraineeSpringWebApp.class, args);

//        to see entries in database do following steps

        /*

        open browser
        give url "http://localhost:8080/h2-console"
        in jdbc url give jdbc:h2:mem:testdb
        test connection
        click connect to access database

        */
    }

}
