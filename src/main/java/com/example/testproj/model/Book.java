package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Book", schema = "public")
public class Book {
    @Id
    @Column(name = "Book_Id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bookId;
    @Column(name = "Author", updatable = false, nullable = false)
    private String author;
    @Column(name = "Price", nullable = false)
    private Long price;
}
