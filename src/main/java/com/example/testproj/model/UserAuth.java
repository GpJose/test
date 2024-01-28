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
@Table(name = "User_auth", schema = "public")
@Builder
public class UserAuth {
    @Id
    @Column(name = "Login", unique = true, updatable = false)
    private String login;
    @Column(name = "Password")
    private String password;
    @OneToOne
    @JoinColumn(name = "User_ID", unique = true)
    private User userId;
}
