package com.example.testproj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class People {
    @Id
    @JsonProperty("id")
    private Long id;
    //Имя
    @JsonProperty("first_name")
    private String first_name;
    //Отчество
    @JsonProperty("second_name")
    private String second_name;
    //Фамилия
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("full_name")
    private String full_name;

}
