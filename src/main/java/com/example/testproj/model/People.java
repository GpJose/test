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
@Table(schema = "people", name = "People")
@Builder
public class People {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    //Имя
    @Column(name = "Fisrt_name")
    private String firstName;
    //Отчество
    @Column(name = "Second_Name")
    private String secondName;
    //Фамилия
    @Column(name = "Last_name")
    private String lastName;
    @Column(name = "Full_name")
    private String fullName;

}
