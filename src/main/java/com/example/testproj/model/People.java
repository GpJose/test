package com.example.testproj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "People", name = "People")
@Builder
public class People {
    @Id
    @Column(name = "ID")
    private Long id;
    //Имя
    @Column(name = "Fisrt_name")
    private String first_name;
    //Отчество
    @Column(name = "Second_Name")
    private String second_name;
    //Фамилия
    @Column(name = "Last_name")
    private String last_name;
    @Column(name = "Full_name")
    private String full_name;

}
