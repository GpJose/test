package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "people")
@Builder
public class People {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Имя
    @Column(name = "first_name")
    private String firstName;
    //Отчество
    @Column(name = "second_name")
    private String secondName;
    //Фамилия
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;

}
