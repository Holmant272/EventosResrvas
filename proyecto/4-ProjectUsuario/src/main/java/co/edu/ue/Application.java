package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.ue.Entity"})
@EnableJpaRepositories(basePackages = {"co.edu.ue.repositoryJPA"})
@ComponentScan(basePackages = {"co.edu.ue.repositoryDAO", "co.edu.ue.controller", "co.edu.ue.service", "co.edu.ue"})

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
