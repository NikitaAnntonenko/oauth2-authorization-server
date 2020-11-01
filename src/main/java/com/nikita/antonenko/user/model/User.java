package com.nikita.antonenko.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @NotNull
    private UUID identifier;

    @NotNull
    private Gender gender;

    @NotBlank
    @Size(max = 100)
    private String firstName;

    @NotBlank
    @Size(max = 100)
    private String lastName;

    @NotBlank
    @Size(max = 200)
    private String password;

    @NotNull @Email
    private String email;

    @NotBlank
    @Size(max = 100)
    private String username;

    @NotNull
    @Size(max = 100)
    private String phone;

    private Set<String> groups = new HashSet<>();

    @NotNull
    private Address address;

    @NotNull
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "User{"
                + "identifier="
                + identifier
                + ", gender="
                + gender
                + ", firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", password='"
                + password
                + '\''
                + ", email='"
                + email
                + '\''
                + ", username='"
                + username
                + '\''
                + ", phone='"
                + phone
                + '\''
                + ", groups="
                + groups
                + ", address="
                + address
                + ", updatedAt="
                + updatedAt
                + '}';
    }
}

