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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", updatable = false)
    private User userId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="bookId", updatable = false)
    private Book bookId;
    @Column(name = "currentChapter", columnDefinition = "bigint default 0", nullable = false)
    private Long currentChaper;
    @Column(name = "currentPage", columnDefinition = "bigint default 0",nullable = false)
    private Long currentPage;
}
