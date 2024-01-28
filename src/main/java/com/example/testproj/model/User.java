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
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonProperty("id")
    private Long id;
    //Имя
    @ToString.Include
    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;
    //Отчество
    @ToString.Include
    @Column(name = "second_name")
    @JsonProperty("secondName")
    private String secondName;
    //Фамилия
    @ToString.Include
    @Column(name = "last_name")
    @JsonProperty("lastName")
    private String lastName;
}
