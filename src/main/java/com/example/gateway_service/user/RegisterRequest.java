package com.example.gateway_service.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank (message = "email is required")
    @Email(message = "Invalid email format")
    private String email;
    private String keycloakId;
    @NotBlank (message = "password is required")
    @Size(min =6, message ="password must have at least 6 characters")
    private String password;
    private String firstName;
    private String lastName;
}
