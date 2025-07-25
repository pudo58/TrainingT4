package com.diemdt.trainingT4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TrainingT4Application {

    public static void main(String[] args) {
        SpringApplication.run(TrainingT4Application.class, args);
    }

}
