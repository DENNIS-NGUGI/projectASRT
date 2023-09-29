package com.projectkra.main;

import com.projectkra.main.com.projectkra.main.Repository.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class ProjectKraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectKraApplication.class, args);
    }

}
