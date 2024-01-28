package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Library", schema = "public")
@Builder
@AllArgsConstructor
public class Library {
    @Id
    @Column(name = "ID",updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "User_Id", updatable = false)
    private User userId;
    @ManyToOne
    @JoinColumn(name ="Book_id", updatable = false)
    private Book bookId;
    @Column(name = "Current_Chapter", columnDefinition = "bigint default 0", nullable = false)
    private Long currentChaper;
    @Column(name = "Current_Page", columnDefinition = "bigint default 0",nullable = false)
    private Long currentPage;
}
