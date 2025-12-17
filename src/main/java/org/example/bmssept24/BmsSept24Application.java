package org.example.bmssept24;

import org.example.bmssept24.controllers.UserController;
import org.example.bmssept24.dtos.SignInRequestDto;
import org.example.bmssept24.dtos.SignInResponeDto;
import org.example.bmssept24.dtos.SignUpRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmsSept24Application implements CommandLineRunner {
    @Autowired
    private UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignInRequestDto signInRequestDto = new SignInRequestDto();
        signInRequestDto.setEmail("N@scaler.com");
        signInRequestDto.setPassword("a");
        userController.signIn(signInRequestDto);
        System.out.println("Application started successfully!");
        // You can add more startup logic here if needed
    }

    public static void main(String[] args) {
        SpringApplication.run(BmsSept24Application.class, args);
    }
}
