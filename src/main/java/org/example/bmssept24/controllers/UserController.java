package org.example.bmssept24.controllers;

import org.example.bmssept24.dtos.*;
import org.example.bmssept24.models.User;
import org.example.bmssept24.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignInResponeDto signIn(SignInRequestDto requestDto) {
        SignInResponeDto responseDto = new SignInResponeDto();
        try {
            userService.signIn(requestDto.getEmail(), requestDto.getPassword());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            System.out.println("Sign in successful for user: " + requestDto.getEmail());
        } catch (Exception e) {
            System.out.println("Exception Occurred during sign in: " + e.getMessage());
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        SignUpResponseDto responseDto = new SignUpResponseDto();
        try {
            User user = userService.signUp(requestDto.getEmail(), requestDto.getPassword());
            responseDto.setStatus(ResponseStatus.SUCCESS);
            responseDto.setUserId(user.getId());
        } catch (Exception e) {
            System.out.println("Exception occurred during sign up: " + e.getMessage());
            responseDto.setStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
