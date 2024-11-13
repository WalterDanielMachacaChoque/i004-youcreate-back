package com.igrowker.miniproject.User.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthCreateUserRequestDto(@NotBlank(message = "Username cannot be blank") String userName,
                                       @NotBlank(message = "Last name cannot be blank") String lastName,
                                       @NotBlank(message = "Email cannot be blank") @Email(message = "Email must be valid") String email,
                                       @NotBlank(message = "Password cannot be blank") String password) {
}