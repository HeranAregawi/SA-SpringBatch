package com.miniproject.batchprocessingv2;

import com.miniproject.batchprocessingv2.domain.Role;
import com.miniproject.batchprocessingv2.domain.User;
import com.miniproject.batchprocessingv2.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BatchProcessingV2Application {

    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingV2Application.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "Heran Aregawi", "Heran", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Sopheary Rin", "Sopheary", "123", new ArrayList<>()));

            userService.addRoleToUser("Heran", "ROLE_USER");
            userService.addRoleToUser("Heran", "ROLE_ADMIN");
            userService.addRoleToUser("Sopheary", "ROLE_USER");
        };


    }

}

