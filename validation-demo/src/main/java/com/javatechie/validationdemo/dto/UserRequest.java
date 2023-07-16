package com.javatechie.validationdemo.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {
    @NotBlank(message = "Username should not be blank")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "not valid mobile number")
    private String mobile;
    private String gender;
    @Min(10)
    @Max(68)
    private int age;
    @NotBlank(message = "nationality should not be blank")
    private String nationality;
}
