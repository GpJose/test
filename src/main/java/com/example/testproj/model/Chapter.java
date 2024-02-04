package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Chapter", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Chapter {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_Id", updatable = false)
    private Book bookId;
    @Column(name = "chapter", columnDefinition = "bigint default 0", nullable = false)
    private Long chapter;
    @Column(name = "page", columnDefinition = "bigint default 0", nullable = false)
    private Long page;
}