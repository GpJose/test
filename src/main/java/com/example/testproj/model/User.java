package com.example.testproj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "User", schema = "public")
@Builder
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    //Имя
    @ToString.Include
    @Column(name = "firstName")
    @JsonProperty("firstName")
    private String firstName;
    //Отчество
    @ToString.Include
    @Column(name = "secondName")
    @JsonProperty("secondName")
    private String secondName;
    //Фамилия
    @ToString.Include
    @Column(name = "lastName")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name = "login",unique = true,updatable = false,nullable = false)
    @JsonProperty("login")
    private String login;
    private String password;
}
