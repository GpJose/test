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
    @Column(name = "user_Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    //Имя
    @ToString.Include
    @Column(name = "first_Name")
    @JsonProperty("firstName")
    private String firstName;
    //Отчество
    @ToString.Include
    @Column(name = "second_Name")
    @JsonProperty("secondName")
    private String secondName;
    //Фамилия
    @ToString.Include
    @Column(name = "last_Name")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name = "login",unique = true,updatable = false,nullable = false)
    @JsonProperty("login")
    private String login;
    private String password;
}
